import { Link } from "react-router-dom";
import imagenCamion from "./../../../public/images/camion.png";
type InstrumentoParams = {
    id: number;
    instrumento: string;
    marca: string;
    modelo: string;
    imagen: string;
    precio: number;
    costoEnvio: string;
    cantidadVendida: number;
    descripcion: string;
}

function ItemInstrumento(args: InstrumentoParams) {

    const costoEnvioText = args.costoEnvio === "G" ? (
        <span className="text-success">
            <img src={imagenCamion} alt="Envío gratis" /> Envío gratis a todo el país
        </span>
    ) : (
        <span className="text-warning">
            Costo de Envío Interior de Argentina ${args.costoEnvio}
        </span>
    );


    return (
        <>
            <div key={args.id} className="col-sm-4 mb-4 mb-sm-0 espacio">
                <div className="card tarjeta">
                    <div>
                        <img src={`./images/${args.imagen}`} className="card-img-top img-altura" alt={args.imagen} />
                    </div>
                    <div className="card-body altura-cuerpo">
                        <p className="card-title">{args.instrumento}</p>
                        <p className="card-text h1">$ {args.precio}</p>
                        <p className={`card-text`}>{costoEnvioText}</p>
                        <p className='card-text'>{args.cantidadVendida} vendidos</p>
                        <br />
                        <Link to={`/products/detalle/${args.id}`} className="btn btn-primary">Ver Detalle</Link>
                    </div>
                </div>
            </div>
        </>
    )
}

export default ItemInstrumento