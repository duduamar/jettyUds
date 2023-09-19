package jetty

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class BlockingServlet: HttpServlet() {

  override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
    resp?.contentType = "application/json"
    resp?.status = HttpServletResponse.SC_OK
    resp?.writer?.println("{ \"status\": \"ok\"}")
  }

}