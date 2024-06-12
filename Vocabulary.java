package bpmn2owl;

/**
 * Vocabulary used in ontologies
 *
 * @author Szabina Fodor
 */
public final class Vocabulary {

    public final static String baseIRI = "http://www.uni-corvinus.hu/ontologies/corvinus/";
    public final static String documentClassName = "Document";
    public final static String roleClassName = "Role";
    public final static String ITClassName = "IT_system";
    public final static String StartEvent = "Start_Event";
    public final static String EndEvent = "End_Event";
    public final static String taskClassName = "Task";
    public final static String processClassName = "Process";

    public final static String sourceFile = "BPMN_all.bpmn"; //"EvaluateRoadTrip_(RegionA).bpmn"; //"Overview_ Best Practice UX Process (en).bpmn"; //"ARS0521.bpmn"; //"adonis_2019.xml"; //"Applying research support (en).bpmn"; //
    public final static String sourcePath = "xmls";
    public final static String targetPath = "owls";
    public final static String targetFile = "BPMN_all.owl"; //""EvaluateRoadTrip_(RegionA).owl";//"ARS0521v3.owl";//"erasmusv3.owl"; //"cubv2.owl"; //
}
