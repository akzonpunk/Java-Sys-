<%-- 
    Document   : formPersona
    Created on : 03/10/2018, 11:47:27 AM
    Author     : LAB_SOFTWARE-DTI
--%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <section class="content-header">
    <h1>
      Page Header
      <small>Optional description</small>
    </h1>
    <ol class="breadcrumb">
      <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
      <li class="active">Here</li>
      <li class="active"><a href="/ven" class="btn btn-warning">Ir Venta</a></li>
    </ol>
  </section>
<!-- Main content -->
<section class="content">    
    <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Formulario de ventas</h3>
            </div>
    <c:url var="urlsave" value="${pageContext.request.contextPath}/guardarVenta" />
    <frm:form modelAttribute="modeloVenta" method="post" action="${urlsave}" class="form-horizontal" >
  
            <div class="box-body">
                <div class="form-group">
                    <frm:label path="nombre" class="col-sm-2 control-label" >Nombres:</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="nombre" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="articulo" class="col-sm-2 control-label">Articulos:</frm:label>
                    <div class="col-sm-10"><frm:input path="articulo" class="form-control"  /></div>                    
                </div>
                <div class="form-group">
                    <frm:label path="codigo" class="col-sm-2 control-label">Codigo:</frm:label>
                    <div class="col-sm-10"><frm:input path="codigo" class="form-control" /></div>
                </div>
          

                

              </div>
              <!-- /.box-body -->

              <div class="box-footer">                
                <input type="submit" value="Guardar" class="btn btn-primary pull-right" />
              </div>            
    </frm:form>
</div>

</section>        
</div>    