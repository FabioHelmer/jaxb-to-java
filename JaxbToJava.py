
import os
import subprocess
from subprocess import PIPE
from winotify import Notification, audio


dicionario = {}
dicionario["evtInfoEmpregador.xsd"] = 	1000
dicionario["evtTabEstab.xsd"] =	1005
dicionario["evtTabRubrica.xsd"] =	1010
dicionario["evtTabLotacao.xsd"] =	1020
dicionario["evtTabProcesso.xsd"] =	1070
dicionario["evtRemun.xsd"] =	1200
dicionario["evtRmnRPPS.xsd"] =	1202
dicionario["evtBenPrRP.xsd"] =	1207
dicionario["evtPgtos.xsd"] =	1210
dicionario["evtComProd.xsd"] =	1260
dicionario["evtContratAvNP.xsd"] =	1270
dicionario["evtInfoComplPer.xsd"] =	1280
dicionario["evtReabreEvPer.xsd"] =	1298
dicionario["evtFechaEvPer.xsd"] =	1299
dicionario["evtAdmPrelim.xsd"] =	2190
dicionario["evtAdmissao.xsd"] =	2200
dicionario["evtAltCadastral.xsd"] =	2205
dicionario["evtAltContratual.xsd"] =	2206
dicionario["evtCAT.xsd"] =	2210
dicionario["evtMonit.xsd"] =	2220
dicionario["evtAfastTemp.xsd"] =	2230
dicionario["evtCessao.xsd"] =	2231
dicionario["evtExpRisco.xsd"] =	2240
dicionario["evtReintegr.xsd"] =	2298
dicionario["evtDeslig.xsd"] =	2299
dicionario["evtTSVInicio.xsd"] =	2300
dicionario["evtTSVAltContr.xsd"] =	2306
dicionario["evtTSVTermino.xsd"] =	2399
dicionario["evtCdBenefIn.xsd"] =	2400
dicionario["evtCdBenefAlt.xsd"] =	2405
dicionario["evtCdBenIn.xsd"] =	2410
dicionario["evtCdBenAlt.xsd"] =	2416
dicionario["evtReativBen.xsd"] =	2418
dicionario["evtCdBenTerm.xsd"] =	2420
dicionario["evtExclusao.xsd"] =	3000
dicionario["evtBasesTrab.xsd"] =	5001
dicionario["evtIrrfBenef.xsd"] =	5002
dicionario["evtBasesFGTS.xsd"] =	5003
dicionario["evtCS.xsd"] =	5011
dicionario["evtIrrf.xsd"] =	5012
dicionario["evtFGTS.xsd"] =	5013
dicionario["evtBaixa.xsd"] = 8299

#1.2
dicionario["evtAnotJud.xsd"] =	8200
dicionario["evtContProc.xsd"] =	2501
dicionario["evtExcProcTrab.xsd"] =	3500
dicionario["evtFGTSProcTrab.xsd"] =	5503
dicionario["evtProcTrab.xsd"] =	2500 
dicionario["evtTribProcTrab.xsd"] =	5501 
dicionario["evtToxic.xsd"] =	2221
dicionario["evtConsolidContProc.xsd"] =	2555


log = open('log.txt','w', encoding="UTF8")
path = 'XSD/nt032025'

for dirname, categoryname, filenames in os.walk(path):
    # filename
    for filename in filenames:
        # Absolute path
        current_file = os.path.abspath(os.path.join(dirname, filename))
        print(current_file)
        if(filename in dicionario):    
            path_out = f'OUT.S{dicionario[filename]}'
        else:
            path_out = f'OUT.{filename.replace(".xsd","").replace("-","")}'
        
        #xjc -p package_destino pasta_xsd
        comando = f'xjc -p {path_out} {path}/{filename} -encoding UTF-8'  
        
        try:
            subprocess.run(comando,  check=True, stdout=PIPE, stderr=PIPE)
        except subprocess.CalledProcessError as err:
            log.write(f"{err} {err.stderr.decode('utf8')}")
            log.write("\r\n")
log.close()
notificacao = Notification(app_id="JaxbToJava", title="JaxbToJava",
                    msg="Finalizou a geração das classes java",
                    duration="short")

notificacao.show()
            
                
