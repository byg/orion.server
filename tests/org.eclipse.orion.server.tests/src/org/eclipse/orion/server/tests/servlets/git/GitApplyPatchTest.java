
import org.eclipse.orion.server.tests.ServerTestsActivator;
import com.meterware.httpunit.PostMethodWebRequest;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;

		WebRequest request = getGetRequest(project.getString(ProtocolConstants.KEY_CONTENT_LOCATION));
		WebRequest request = getGetRequest(project.getString(ProtocolConstants.KEY_CONTENT_LOCATION));
		WebRequest request = getGetRequest(project.getString(ProtocolConstants.KEY_CONTENT_LOCATION));
		WebRequest request = getGetRequest(project.getString(ProtocolConstants.KEY_CONTENT_LOCATION));
		WebRequest request = getGetRequest(project.getString(ProtocolConstants.KEY_CONTENT_LOCATION));
		String requestURI = URI.create(ServerTestsActivator.getServerLocation()).resolve(location).toString();
		//		if (location.startsWith("http://"))
		//			requestURI = location;
		//		else if (location.startsWith("/"))
		//			requestURI = SERVER_LOCATION + location;
		//		else
		//			requestURI = SERVER_LOCATION + GIT_SERVLET_LOCATION + Diff.RESOURCE + location;