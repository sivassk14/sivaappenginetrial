package KafkaBeam;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.kafka.KafkaIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.transforms.ToString;
import org.apache.beam.sdk.transforms.Values;
import org.apache.beam.sdk.values.PCollection;

import java.util.Arrays;

public class KafkaBeamProcess {
    public static void main(String[] args) throws Exception {

/*        Options options = PipelineOptionsFactory.fromArgs(args).withValidation()
                .as(Options.class);
        //options.setRunner(FlinkRunner.class);

        Pipeline p = Pipeline.create(options);

        KafkaIO.Read<byte[], String> kafkaIOReader = KafkaIO.read()
                .withBootstrapServers("192.168.99.100:32771")
                .withTopics(Arrays.asList("beam".split(",")))
                .updateConsumerProperties(ImmutableMap.of("auto.offset.reset", (Object)"earliest"))
                .withValueCoder(StringUtf8Coder.of());


        p.apply(kafkaIOReader.withoutMetadata())
                .apply(Values.<String>create())
                .apply(Window.<String>into(
                        FixedWindows.of(Duration.standardMinutes(options.getWindowSize()))))
                .apply(new CountWords())
                .apply(MapElements.via(new FormatAsTextFn()))
                .apply("WriteCounts", TextIO.Write.to(options.getOutput()));

        p.run();*/

        PipelineOptions options =
                PipelineOptionsFactory.fromArgs(args).create();

        Pipeline p = Pipeline.create(options);

       String KAFKA_BROKER =
                "localhost:9092,localhost:9093,localhost:9094";
        String KAFKA_READ_TOPIC = "test";

/*        PCollection<String> input = p.apply(KafkaIO.<Long, String>readBytes()
                .withBootstrapServers(KAFKA_BROKER)
                .withTopics(Arrays.asList(KAFKA_READ_TOPIC))
                .withoutMetadata())
                .apply(Values.<byte[]>create())
                .apply(ParDo.of(new ToString()));*/
        //.apply(ParDo.of(new BytesToString()));

    }
}
