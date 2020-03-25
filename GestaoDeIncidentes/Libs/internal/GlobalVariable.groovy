package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object DSCOcorrencia
     
    /**
     * <p></p>
     */
    public static Object BINEvidencia
     
    /**
     * <p></p>
     */
    public static Object FormStart
     
    /**
     * <p></p>
     */
    public static Object Url
     
    /**
     * <p></p>
     */
    public static Object TipodeSolicitacao
     
    /**
     * <p></p>
     */
    public static Object VALTipodeSolicitacao
     
    /**
     * <p></p>
     */
    public static Object VALDescricaodaOcorrencia
     
    /**
     * <p></p>
     */
    public static Object VALArquivoEvidencia
     
    /**
     * <p></p>
     */
    public static Object MinValueWait
     
    /**
     * <p></p>
     */
    public static Object Aplicacao
     
    /**
     * <p></p>
     */
    public static Object VALAplicacao
     
    /**
     * <p></p>
     */
    public static Object Ambiente
     
    /**
     * <p></p>
     */
    public static Object VALAmbiente
     
    /**
     * <p></p>
     */
    public static Object ROTipodeSolicitacao
     
    /**
     * <p></p>
     */
    public static Object ROAplicacao
     
    /**
     * <p></p>
     */
    public static Object ROTipoAmbiente
     
    /**
     * <p></p>
     */
    public static Object HistoricodeOcorrencias
     
    /**
     * <p></p>
     */
    public static Object VALData
     
    /**
     * <p>Profile default : Arquivo do Hist&oacute;rico de Ocorr&ecirc;ncias</p>
     */
    public static Object BINArquivo
     
    /**
     * <p></p>
     */
    public static Object BOLCancelar
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            DSCOcorrencia = selectedVariables['DSCOcorrencia']
            BINEvidencia = selectedVariables['BINEvidencia']
            FormStart = selectedVariables['FormStart']
            Url = selectedVariables['Url']
            TipodeSolicitacao = selectedVariables['TipodeSolicitacao']
            VALTipodeSolicitacao = selectedVariables['VALTipodeSolicitacao']
            VALDescricaodaOcorrencia = selectedVariables['VALDescricaodaOcorrencia']
            VALArquivoEvidencia = selectedVariables['VALArquivoEvidencia']
            MinValueWait = selectedVariables['MinValueWait']
            Aplicacao = selectedVariables['Aplicacao']
            VALAplicacao = selectedVariables['VALAplicacao']
            Ambiente = selectedVariables['Ambiente']
            VALAmbiente = selectedVariables['VALAmbiente']
            ROTipodeSolicitacao = selectedVariables['ROTipodeSolicitacao']
            ROAplicacao = selectedVariables['ROAplicacao']
            ROTipoAmbiente = selectedVariables['ROTipoAmbiente']
            HistoricodeOcorrencias = selectedVariables['HistoricodeOcorrencias']
            VALData = selectedVariables['VALData']
            BINArquivo = selectedVariables['BINArquivo']
            BOLCancelar = selectedVariables['BOLCancelar']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
