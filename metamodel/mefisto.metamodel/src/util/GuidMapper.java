package util;

import java.util.HashMap;

import miml.fragment.MethodFragment;

public class GuidMapper 
{
	private static final HashMap<String, String> guidMap = new HashMap<String, String>();
    
	// Init MAP
	static 
    {
        guidMap.put("Reimplementation", "_B-7N4MmNEeSf9oguAurc1A");
        guidMap.put("ModelDiscovery", "_pRwwkMmMEeSf9oguAurc1A");
        guidMap.put("ProgramComprehension", "_uY_JEMmMEeSf9oguAurc1A");
        guidMap.put("Concretization", "_1z40YMmMEeSf9oguAurc1A");
        guidMap.put("CodeGeneration", "__2lBUMmMEeSf9oguAurc1A");
        guidMap.put("LanguageTransformation", "_8-QJUMmMEeSf9oguAurc1A");
        guidMap.put("ArchitectureRestructuring", "_h1GHoGaxEeWsvrukVmh9yw");
        guidMap.put("LPSM", "_EgavsMmMEeSf9oguAurc1A");
        guidMap.put("TPSM", "_H6bYcMmMEeSf9oguAurc1A");
        guidMap.put("LegacySourceCode", "_Bc6icMmMEeSf9oguAurc1A");
        guidMap.put("TransformedSourceCode", "_C7_IgMmMEeSf9oguAurc1A");
        guidMap.put("FPIM", "_JDl_8MmMEeSf9oguAurc1A");
        guidMap.put("APIM", "_KIvDEMmMEeSf9oguAurc1A");
        guidMap.put("Restructuring", "_4p2EEGasEeWsvrukVmh9yw");
        guidMap.put("Platform", "_YYEpAGawEeWsvrukVmh9yw");
        guidMap.put("System", "_ZVBZcGawEeWsvrukVmh9yw");
        guidMap.put("SoftwareDeveloper", "_-0YZ8MmLEeSf9oguAurc1A");
        guidMap.put("SystemExpert", "_miqRsGarEeWsvrukVmh9yw");
        guidMap.put("ModelTransformationEngine", "__z5CkHC1EeWddotDUZcXyA");
        guidMap.put("CodeGenerationEngine", "_HyliAHC3EeWddotDUZcXyA");
        guidMap.put("Parser", "_GnMF4HC3EeWddotDUZcXyA");
        guidMap.put("PlatformIndependentArchitectureConcretization", "_tUMvYIPVEeWddotDUZcXyA");
        guidMap.put("PlatformDependentArchitectureConcretization", "_gzX-MGasEeWsvrukVmh9yw");
        guidMap.put("PlatformIndependentArchitectureRecovery", "_iiRd4IPVEeWddotDUZcXyA");
        guidMap.put("PlatformDependentArchitectureRecovery", "");
        guidMap.put("LPSMEnrichment", "_7dJnEIPVEeWddotDUZcXyA");
        guidMap.put("FPIMEnrichment", "_-wvewIPVEeWddotDUZcXyA");
        guidMap.put("APIMEnrichment", "_2zY4wGasEeWsvrukVmh9yw");
        
        guidMap.put("Tool", "_71OeIGawEeWsvrukVmh9yw");
        guidMap.put("ToolDeveloper", "_4NC5kMmLEeSf9oguAurc1A");
        guidMap.put("MetamodelDefinition", "_lRADQGawEeWsvrukVmh9yw");
        guidMap.put("MetamodelProfileDefinition", "_mNDb0GawEeWsvrukVmh9yw");
        guidMap.put("ToolDefinition", "_9OySEGawEeWsvrukVmh9yw");
        guidMap.put("ModelTransformationRulesDefinition", "_C0G70GaxEeWsvrukVmh9yw");
        guidMap.put("CodeGenerationRulesDefinition", "_IfZqsGaxEeWsvrukVmh9yw");
        guidMap.put("ReimplementationGuidanceSpecification", "_P7yjwGaxEeWsvrukVmh9yw");
        guidMap.put("Metamodel", "_oS340GawEeWsvrukVmh9yw");
        guidMap.put("MetamodelProfile", "_pPq4QGawEeWsvrukVmh9yw");
        guidMap.put("ModelTransformationRules", "_BAVREGaxEeWsvrukVmh9yw");
        guidMap.put("CodeGenerationRules", "_HF12wGaxEeWsvrukVmh9yw");
        guidMap.put("ReimplementationGuidance", "_Uxl1EGaxEeWsvrukVmh9yw");
    }
	
	public static String getProjectIndependentGuid(MethodFragment methodFragment)
	{
		String guid = "";
		
		try 
		{			
			if (guidMap.containsKey(methodFragment.eClass().getName()))
				guid = guidMap.get(methodFragment.eClass().getName());
			else
				guid = "Undefined";
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			guid = "Error";
		}
		
		return guid;
	}
}
