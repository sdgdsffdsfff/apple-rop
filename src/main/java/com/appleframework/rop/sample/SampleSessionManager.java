/**
 * 版权声明：中图一购网络科技有限公司 版权所有 违者必究 2012 
 * 日    期：12-7-17
 */
package com.appleframework.rop.sample;

import com.appleframework.rop.session.Session;
import com.appleframework.rop.session.SessionManager;
import com.appleframework.rop.session.SimpleSession;
import com.appleframework.rop.utils.UuidUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public class SampleSessionManager implements SessionManager{
	
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private final Map<String, Session> sessionCache = new ConcurrentHashMap<String, Session>(128, 0.75f, 32);

    @Override
    public void addSession(String sessionId, Session session) {
        sessionCache.put(sessionId, session);
    }

    @Override
    public Session getSession(String sessionId) {
        return sessionCache.get(sessionId);
    }

    @Override
    public void removeSession(String sessionId) {
        sessionCache.remove(sessionId);
    }

	@Override
	public Session createSession(Map<String, Object> map) {
		String sessionId = UuidUtils.getUUID();
		Session session = new SimpleSession();
		session.setSessionId(sessionId);
		addSession(sessionId, session);
		return session;
	}
    
}

