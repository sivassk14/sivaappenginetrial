package sivaappenginetrial;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;

public class BeamTrial {

    //private static final Logger LOG = LoggerFactory.getLogger(BeamTrial.class);

    public static void main(String[] args) {
        System.out.println("trial begin");

        PipelineOptions options =
                PipelineOptionsFactory.fromArgs(args).create();

        Pipeline p = Pipeline.create(options);

        PCollection<String> lines = p.apply(
                "ReadMyFile", TextIO.read().from("//home/sivakumar/Documents/Work/GCP/cities.txt"));

/*        lines.apply("WriteToText",
                TextIO.write().to("file://home/sivakumar/Documents/Work/GCP")
                        .withSuffix(".csv"));*/


//        System.out.println(lines.getPipeline());
        lines.apply(ParDo.of(new DoFn<String, KV<Character, String>>() {
            @ProcessElement
            public void processElement(ProcessContext c) {
                String word = c.element();
                char firstletter = word.charAt(0);
                c.output(KV.of(firstletter,word));
            }
        }));


        System.out.println("trial end");
    }
}
