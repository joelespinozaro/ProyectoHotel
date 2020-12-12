<%@page import="presentacion.ModeloReserva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hotel / Reserva</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Merriweather+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./Styleglobal.css">
        <link rel="stylesheet" href="./StyleReserva.css">
    </head>
    <body>
        <% ModeloReserva modRes=(ModeloReserva)session.getAttribute("sesRes");%>
        <header>
            <section>
                <h1>Proyecto Hotel</h1>
            </section>
        </header>
        <main>
            <div>
                <form action="ControlEmpleado" method="Post">
                    <input type="submit" name="acc" value="Regresar" class="back"/>
                </form>
            </div>
            <h1>Gestion de Reserva</h1>
            <form action="ControlReserva" method="Post">
                <section>
                    <div class="form-item">
                        <label for="numero">Numero</label>
                        <input id="numero" name="numero" type="text" value=""/>
                    </div>
                    <div class="form-item">
                        <label for="fecha">Fecha</label>
                        <input id="fecha" name="fecha" type="text" value=""/>
                    </div>
                    <div class="form-item">
                        <label for="estado">Estado</label>
                        <input id="estado" name="estado" type="text" value=""/>
                    </div>
                </section>

                <section>
                    <div class="form-item">
                        <label for="cliente">Cliente</label>
                        <input id="cliente" name="cliente" type="text" value=""/>
                    </div>
                    <div class="form-item">
                        <label for="nombre">Nombre</label>
                        <input id="nombre" name="nombre" type="text" value=""/>
                    </div>
                    <div class="form-item">
                        <label for="descuento">Descuento</label>
                        <input id="descuento" name="descuento" type="text" value=""/>
                    </div>
                </section>
            <% for(int i=0; i< modRes.getCesta().size();i++) { %>
            <% Object[] f =(Object[]) modRes.getCesta().get(i); %>
            <section class="wrap-hab">
                <form action="ControlReserva" method="Post">
                    <div class="form-item">
                        <label for="codigo">Codigo</label>
                        <input type="text" name="codigo" value='<%= f[0] %>'/>
                    </div>
                    <div class="form-item">
                        <label>Nombre</label>
                        <input type="text"  value='<%= f[1] %>'/>
                    </div>
                    <div class="form-item">
                        <label>Precio</label>
                        <input type="text"  value='<%= f[2] %>'/>
                    </div>
                    <div class="form-item">
                        <label>Dias</label>
                        <input type="text"  value='<%= f[3] %>' />
                    </div>
                    <div class="form-item">
                        <label>Importe</label>
                        <input type="text"  value='<%= f[4] %>' />
                    </div>

                    <input type="submit" name="acc" value="Quitar" class="btn" style="margin-top: 30px;"/>
                </form>
            </section>
            <% } %>
                <section>
                    <div class="form-item">
                        <label for="subtotal">Sub Total</label>
                        <input id="subtotal" name="subtotal" type="text" value='<%= modRes.getSubTotal() %>'/>
                    </div>
                    <div class="form-item">
                        <label for="descuento2">Descuento</label>
                        <input id="descuento2" name="descuento" type="text" value='<%= modRes.getDesc()%>'/>
                    </div>
                    <div class="form-item">
                        <label for="total">Total</label>
                        <input id="total" name="total" type="text" value='<%= modRes.getTotal()%>'/>
                    </div>
                </section>


                <section>
                    <input type="submit" name="acc" value="Nuevo Reserva" class="btn"/>
                    <input type="submit" name="acc" value="Listar Habitaciones" class="btn"/>
                    <input type="submit" name="acc" value="Grabar Reserva" class="btn"/>
                </section>
            </form>
        </main>
    </body>
</html>
