package org.hpccsystems.ws.client.platform.test;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.extended.HPCCWsSQLClient;
import org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ExecuteSQLResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_34.DFUDataColumn;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUPublishWorkunitResponse;
import org.hpccsystems.ws.client.platform.DFUDataColumnInfo;
import org.hpccsystems.ws.client.platform.DFURecordDefInfo;
import org.hpccsystems.ws.client.platform.EclRecordInfo;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.platform.Cluster;

public class CompileECL
{

    public static void main(String[] args)
    {
        try
        {
            Platform platform = Platform.get("http", "localhost", 8010, "", "");

            Version v = platform.getVersion();
            System.out.println(v.toString());

            HPCCWsWorkUnitsClient wc = platform.getWsWorkunitsClient();
            String ecl = "/*\n" + 
            		"    Example code - use without restriction.  \n" + 
            		"*/\n" + 
            		"Layout_Person := RECORD\n" + 
            		"  UNSIGNED1 PersonID;\n" + 
            		"  STRING15  FirstName;\n" + 
            		"  STRING25  LastName;\n" + 
            		"END;\n" + 
            		"\n" + 
            		"allPeople := DATASET([ {1,'Fred','Smith'},\n" + 
            		"                       {2,'Joe','Blow'},\n" + 
            		"                       {3,'Jane','Smith'}],Layout_Person);\n" + 
            		"\n" + 
            		"somePeople := allPeople(LastName = 'Smith');\n" + 
            		"\n" + 
            		"//  Outputs  ---\n" + 
            		"somePeople;\n" + 
            		"";
            
            Cluster[] list = platform.getClusters();
            for (Cluster c : list)
            {
            	System.out.println(c.getName());
            }
            
            WorkunitInfo wu = new WorkunitInfo();
            wu.setECL(ecl);
            wu.setCluster("hthor");
            wc.createWUFromECL(wu);
        }
        catch (Exception e)
        {
            System.out.println( e.getLocalizedMessage());
        }

    }

}
