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
    public String saveMessage(String contact, String message);
    public String setMemoryToSIMMemory();
    public String setToTextFormat();
    public String getAllMessages();
    public String getMessageAt(int messageIndex);
    
    // Utilities
    
    public String getDelimiter();
}
