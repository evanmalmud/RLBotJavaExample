package rlbot;

import com.google.protobuf.InvalidProtocolBufferException;
import rlbot.manager.BotManager;
import rlbot.py.PythonInterface;
import rlbot.py.PythonServer;
import rlbot.util.PortReader;

import java.net.URISyntaxException;

/**
 * See JavaAgent.py for usage instructions
 */
public class JavaExample {

    public static void main(String[] args) throws InvalidProtocolBufferException, URISyntaxException {

        BotManager botManager = new BotManager();
        PythonInterface pythonInterface = new SamplePythonInterface(botManager);
        Integer port = PortReader.readPortFromFile("port.cfg");
        PythonServer pythonServer = new PythonServer(pythonInterface, port);
        pythonServer.start();
    }
}