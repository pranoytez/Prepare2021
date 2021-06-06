package tez.learn;

import java.util.List;

public class AuthenticationManager {
	private String tokenId;
	private int timeToLive;
	private List<String> tokensIssued;
	/**
	 * @return the tokenId
	 */
	public String getTokenId() {
		return tokenId;
	}
	/**
	 * @param tokenId the tokenId to set
	 */
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	/**
	 * @return the timeToLive
	 */
	public int getTimeToLive() {
		return timeToLive;
	}
	/**
	 * @param timeToLive the timeToLive to set
	 */
	public void setTimeToLive(int timeToLive) {
		this.timeToLive = timeToLive;
	}
	/**
	 * @return the tokensIssued
	 */
	public List<String> getTokensIssued() {
		return tokensIssued;
	}
	/**
	 * @param tokensIssued the tokensIssued to set
	 */
	public void setTokensIssued(List<String> tokensIssued) {
		this.tokensIssued = tokensIssued;
	}
	public AuthenticationManager(int timeToLive) {
		super();
		this.timeToLive = timeToLive;
	}
	
	public void generate(String tokenId, int currentTime) {
        
    }
    
    public void renew(String tokenId, int currentTime) {
        
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int result=0;
        
        return result;
    }
}
