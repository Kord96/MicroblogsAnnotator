/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MicroblogsAnnotator;

import gate.*;
import gate.creole.ANNIEConstants;
import gate.creole.POSTagger;
import gate.creole.ResourceInstantiationException;
import gate.creole.tokeniser.*;
import gate.creole.gazetteer.*;
import gate.creole.SerialAnalyserController;
import gate.creole.Transducer;
import gate.creole.orthomatcher.OrthoMatcher;
import gate.creole.splitter.SentenceSplitter;
import gate.gui.*;
import gate.util.GateException;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khaled
 */
public class MicroblogsAnnotator {

    public static void main(String[] args) throws Exception {
        //add relative path here, will do it later
        String inputPath="";
        String OutputPath="";
        GateTool g = new GateTool(inputPath,OutputPath);
        g.RunTwitIE();
        //g.RunANNIE();
    }

}
