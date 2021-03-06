/*
 * FilterBank.java
 *
 */

package DSPnMath;

/**
 *
 * @author Deepayan Bhowmik
 */
public class FilterBank {
    double[][] filter_return;
    /**
     * Creates a new instance of FilterBank
     */
    public double[][] Filter_bank(String filter_select) {
        
         // Filter coefficients are defined for analysis and synthesis filters in proper order
            // [0][] = Low pass analysis filter coeff
            // [1][] = High pass analysis filter coeff
            // [2][] = Low pass sysnthesis filter coeff
            // [3][] = High pass synthesis filter coeff
        
        if(filter_select.compareTo("D4") == 0)
        {  // D4 = Daubechies-4 Filters
                    
            double[][] filterD4 = {{-0.1294095225512603, 0.2241438680420134, 0.8365163037378077, 0.4829629131445341},
                                   {0.4829629131445341, -0.8365163037378077, 0.2241438680420134, 0.1294095225512603},
                                   {0.4829629131445341, 0.8365163037378077, 0.2241438680420134, -0.1294095225512603},
                                   {0.1294095225512603, 0.2241438680420134, -0.8365163037378077, 0.4829629131445341}};
            
            filter_return = filterD4;
        } else if(filter_select.compareTo("D6") == 0){  
                    // D6 = Daubechies-6 Filters                    
            double[][] filterD6 = {{0.035226291882, -0.085441273882, -0.135011020010, 0.459877502118, 0.806891509311, 0.332670552950},            
                                   {0.332670552950, -0.806891509311, 0.459877502118, 0.135011020010, -0.085441273882, -0.035226291882},
                                   {0.332670552950, 0.806891509311, 0.459877502118, -0.135011020010, -0.085441273882, 0.035226291882},                                   
                                   {-0.035226291882, -0.085441273882, 0.135011020010, 0.459877502118, -0.806891509311, 0.33267055295}};
            
            filter_return = filterD6;
        } else if(filter_select.compareTo("D8") == 0){  
                    // D8 = Daubechies-8 Filters                    
            double[][] filterD8 = {{-0.010597401785, 0.032883011667, 0.030841381836, -0.187034811719, -0.027983769417, 0.630880767930,
                                            0.714846570553, 0.230377813309},            
                                   {0.230377813309, -0.714846570553, 0.630880767930, 0.027983769417, -0.187034811719, -0.030841381836, 
                                            0.032883011667, 0.010597401785},
                                   {0.230377813309, 0.714846570553, 0.630880767930, -0.027983769417, -0.187034811719, 0.030841381836, 
                                            0.032883011667, -0.010597401785},                                   
                                   {0.010597401785, 0.032883011667, -0.030841381836, -0.187034811719, 0.027983769417, 0.630880767930,
                                            -0.714846570553, 0.230377813309}};
            
            filter_return = filterD8;
        } else if(filter_select.compareTo("D10") == 0){  
                    // D10 = Daubechies-10 Filters                    
            double[][] filterD10 = {{0.003335725285, -0.012580751999, -0.006241490213, 0.077571493840, -0.032244869585, -0.242294887066,
                                            0.138428145901, 0.724308528438, 0.603829269797, 0.160102397974},
                                    {0.160102397974, -0.603829269797, 0.724308528438, -0.138428145901, -0.242294887066, 0.032244869585,
                                            0.077571493840, 0.006241490213, -0.012580751999, -0.003335725285}, 
                                    {0.160102397974, 0.603829269797, 0.724308528438, 0.138428145901, -0.242294887066, -0.032244869585,
                                            0.077571493840, -0.006241490213, -0.012580751999, 0.003335725285},
                                    {-0.003335725285, -0.012580751999, 0.006241490213, 0.077571493840, 0.032244869585, -0.242294887066,
                                            -0.138428145901, 0.724308528438, -0.603829269797, 0.160102397974}};
            
            filter_return = filterD10;
        } else if(filter_select.compareTo("D16") == 0){  
                    // D16 = Daubechies-16 Filters                    
            double[][] filterD16 = {{-0.000117476784, 0.000675449406, -0.000391740373, -0.004870352993, 0.008746094047, 0.013981027917, -0.04408825393, -0.017369301002, 
                                        0.128747426620, 0.000472484574, -0.284015542962, -0.015829105256, 0.585354683654, 0.675630736297, 0.312871590914, 0.054415842243},
                                    {0.054415842243, -0.312871590914, 0.675630736297, -0.585354683654, -0.015829105256, 0.284015542962, 0.000472484574, -0.128747426620, 
                                        -0.017369301002, 0.04408825393, 0.013981027917, -0.008746094047, -0.004870352993, 0.000391740373, 0.000675449406, 0.000117476784},
                                    {0.054415842243, 0.312871590914, 0.675630736297, 0.585354683654, -0.015829105256, -0.284015542962, 0.000472484574, 0.128747426620, 
                                        -0.017369301002, -0.04408825393, 0.013981027917, 0.008746094047, -0.004870352993, -0.000391740373, 0.000675449406, -0.000117476784},    
                                    {0.000117476784, 0.000675449406, 0.000391740373, -0.004870352993, -0.008746094047, 0.013981027917, 0.04408825393, -0.017369301002, 
                                        -0.128747426620, 0.000472484574, 0.284015542962, -0.015829105256, -0.585354683654, 0.675630736297, -0.312871590914, 0.054415842243}};
            
            filter_return = filterD16;
        } else if(filter_select.compareTo("D20") == 0){  
                    // D20 = Daubechies-20 Filters                    
            double[][] filterD20 = {{-0.000013264203, 0.000093588670, -0.000116466855, -0.000685856695, 0.001992405295, 0.001395351747, -0.010733175483, 
                                        0.003606553567, 0.033212674059, -0.029457536822, -0.071394147166, 0.093057364604, 0.127369340336, -0.195946274377,
                                        -0.249846424327, 0.281172343661, 0.688459039454, 0.527201188932, 0.188176800078, 0.026670057901},
                                    {0.026670057901, -0.188176800078, 0.527201188932, -0.688459039454, 0.281172343661, 0.249846424327, -0.195946274377, 
                                        -0.127369340336, 0.093057364604, 0.071394147166, -0.029457536822, -0.033212674059, 0.003606553567, 0.010733175483,
                                        0.001395351747, -0.001992405295, -0.000685856695, 0.000116466855, 0.000093588670, 0.000013264203},
                                    {0.026670057901, 0.188176800078, 0.527201188932, 0.688459039454, 0.281172343661, -0.249846424327, -0.195946274377, 
                                        0.127369340336, 0.093057364604, -0.071394147166, -0.029457536822, 0.033212674059, 0.003606553567, -0.010733175483,
                                        0.001395351747, 0.001992405295, -0.000685856695, -0.000116466855, 0.000093588670, -0.000013264203},    
                                    {0.000013264203, 0.000093588670, 0.000116466855, -0.000685856695, -0.001992405295, 0.001395351747, 0.010733175483, 
                                        0.003606553567, -0.033212674059, -0.029457536822, 0.071394147166, 0.093057364604, -0.127369340336, -0.195946274377,
                                        0.249846424327, 0.281172343661, -0.688459039454, 0.527201188932, -0.188176800078, 0.026670057901}};
            filter_return = filterD20;
        } else if(filter_select.compareTo("HR") == 0){
            // Haar filter coefficients
            double[][] filterHR = {{0.7071, 0.7071},
                                   {0.7071, -0.7071},
                                   {0.7071, 0.7071},
                                   {-0.7071, 0.7071}};                        
            filter_return = filterHR;
            
        } else if(filter_select.compareTo("978") == 0){
            // 9/7 biorthogonal filter coefficients
              double[][] filter97 = {{0.026748757411, -0.016864118443, -0.078223266529, 0.266864118443, 0.602949018236, 0.266864118443, -0.078223266529, -0.016864118443, 0.026748757411},
                                     {0, 0.045635881557, -0.028771763114, -0.295635881557, 0.557543526229, -0.295635881557, -0.028771763114, 0.045635881557, 0},
                                     {0, -0.045635881557, -0.028771763114, 0.295635881557, 0.557543526229, 0.295635881557, -0.028771763114, -0.045635881557, 0},
                                     {0.026748757411, 0.016864118443, -0.078223266529, -0.266864118443, 0.602949018236, -0.266864118443, -0.078223266529, 0.016864118443, 0.026748757411}};                                                    
              
              
              for(int i=0;i<filter97.length;i++){
                  for(int j=0; j<filter97[0].length; j++){                                         
                      filter97[i][j] = filter97[i][j] * Math.pow(2,0.5);
                  }                  
              }                            
           
              filter_return = filter97;
            
        } else if(filter_select.compareTo("53") == 0){
            // 5/3 biorthogonal
             double[][] filter53 = {{-0.176776695, 0.353553391, 1.060660172, 0.353553391, -0.176776695},                                    
                                    {0, -0.353553391, 0.707106781, -0.353553391, 0},
                                    {0, 0.353553391, 0.707106781, 0.353553391, 0},
                                    {-0.176776695, -0.353553391, 1.060660172, -0.353553391, -0.176776695}};              
            filter_return = filter53;            
        }
      
        return filter_return;
    }
    
}
