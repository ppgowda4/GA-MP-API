package com.gamp.transport;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import com.gamp.config.GoogleAnalyticsConfig;

/**
 * Clases uses AWT classes to discover following properties.
 * <ul>
 * 	<li>Screen Resolution</li>
 *  <li>Screen Colors</li>
 * </ul>
 * 
 * @author Punith
 */
public class AwtRequestParameterDiscoverer extends DefaultRequestParameterDiscoverer {

    @Override
    public DefaultRequest discoverParameters(GoogleAnalyticsConfig config, DefaultRequest request) {
        super.discoverParameters(config, request);

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        if (isEmpty(request.screenResolution())) {
            Dimension screenSize = toolkit.getScreenSize();
            request.screenResolution(((int) screenSize.getWidth()) + "x" + ((int) screenSize.getHeight()) + ", "
                                     + toolkit.getScreenResolution() + " dpi");
        }

        if (isEmpty(request.screenColors())) {
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice[] graphicsDevices = graphicsEnvironment.getScreenDevices();

            StringBuilder sb = new StringBuilder();
            for (GraphicsDevice graphicsDevice : graphicsDevices) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(graphicsDevice.getDisplayMode().getBitDepth());
            }
            request.screenColors(sb.toString());
        }

        return request;
    }
}
