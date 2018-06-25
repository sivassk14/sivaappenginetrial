package KafkaBeam;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.coders.StringUtf8Coder;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.TupleTag;

import java.util.Arrays;
import java.util.List;

//https://beam.apache.org/documentation/programming-guide/
//3.1.2. Creating a PCollection from in-memory data

public class BeamTrialOne {

    public static void main(String[] args) {

        // Create the pipeline.
        PipelineOptions options =
                PipelineOptionsFactory.fromArgs(args).create();
        Pipeline p = Pipeline.create(options);

        // Create a Java Collection, in this case a List of Strings.
        final List<String> LINES = Arrays.asList(
                "To be, or not to be: that is the question: ",
                "Whether 'tis nobler in the mind to suffer ",
                "The slings and arrows of outrageous fortune, ",
                "Or to take arms against a sea of troubles, ");


        final List<KV<String, String>> emailsList = Arrays.asList(
                KV.of("amy", "amy@example.com"),
                KV.of("carl", "carl@example.com"),
                KV.of("julia", "julia@example.com"),
                KV.of("carl", "carl@email.com"));

        final List<KV<String, String>> phonesList = Arrays.asList(
                KV.of("amy", "111-222-3333"),
                KV.of("james", "222-333-4444"),
                KV.of("amy", "333-444-5555"),
                KV.of("carl", "444-555-6666"));

        PCollection<KV<String, String>> emails = p.apply("CreateEmails", Create.of(emailsList));
        PCollection<KV<String, String>> phones = p.apply("CreatePhones", Create.of(phonesList));

        // Apply Create, passing the list and the coder, to create the PCollection.
        p.apply(Create.of(LINES)).setCoder(StringUtf8Coder.of());

        PCollection<String> words = p.apply(Create.of(LINES)).setCoder(StringUtf8Coder.of());

        System.out.println(words);

        PCollection<Integer> wordLengths = words.apply(
                "ComputeWordLengths", ParDo.of(new ComputeWordLengthFn()));

        System.out.println("word length is : " + wordLengths);

   }


    static class ComputeWordLengthFn extends DoFn<String, Integer> {
        @ProcessElement
        public void processElement(ProcessContext c) {
            // Get the input element from ProcessContext.
            int wordLengthCutOff = 2;
            System.out.println("test : " + wordLengthCutOff);
            TupleTag<Integer> wordLengthsAboveCutOffTag = new TupleTag<Integer>();
            String word = c.element();
            if (word.length() <= wordLengthCutOff) {
                c.output(word.length());
            } else {
                c.output(wordLengthsAboveCutOffTag, word.length());
            }
            // Use ProcessContext.output to emit the output element.
        }
    }
}
