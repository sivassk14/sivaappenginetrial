package sivaappenginetrial;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.values.PCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class BeamTrialOne {

    //private static final Logger LOG = LoggerFactory.getLogger(BeamTrialOne.class);

    public static void main(String[] args) {
        System.out.println("trial begin");

        PipelineOptions options =
                PipelineOptionsFactory.fromArgs(args).create();

        Pipeline p = Pipeline.create(options);

        PCollection<String> lines = p.apply(
                "ReadMyFile", TextIO.read().from("//home/sivakumar/Documents/Work/GCP/input.txt"));

        lines.apply("WriteToText",
                TextIO.write().to("file://home/sivakumar/Documents/Work/GCP")
                        .withSuffix(".csv"));


        System.out.println(lines.getPipeline());

        System.out.println("trial end");
    }
}
