/*
 * Default interface to use for OpenSIMKit Device drivers
 */
package org.opensimkit.drivers;

import net.xeoh.plugins.base.Plugin;

/**
 *
 * @author ahmedmaawy
 */
public interface DriverInterface extends Plugin {
    
    // Device identification
    
    public String getManufacturer();
    public String getModel();
    public String getRevision();
    
    // Command functionality
    
    public String runCommand(String command);
    public boolean saveMessage(String contact, String message);
    public boolean setMemoryToSIMMemory();
    public boolean setToTextFormat();
    public String getAllMessages();
    public String getMessageAt(int messageIndex);
    
    // Utilities
    
    public String getDelimiter();
    public boolean isDeviceConnected();
    
    // Connection options
    
    public boolean isGenericConnection();
    public boolean connectToDevice();
    
    // Serial port connections
    
    public boolean connectToSerialPort(int portIndex);
}
