import './App.css'
import axios from "axios";
import {useEffect, useState} from "react";
import {Fatwa} from "./types/Fatwa.ts";

function App() {

    const [fatwas, setFatwas] = useState<Fatwa[]>([])

    useEffect(() => {
        axios.get("/api/fatwa")
            .then(response => {
                setFatwas(response.data)
            })
    }, [])

    return (
        <>
            <h1>Objects test again:</h1>
            {fatwas.map((fatwa) => {
                return (
                    <>
                        <section>
                            <h2>Title: {fatwa.title}</h2>
                            <h2>{fatwa.arabicTitle}</h2>
                            <p>{fatwa.description}</p>
                            <p>{fatwa.quranReference}</p>
                            <p>{fatwa.kitab}</p>
                            <p>{fatwa.footnotes}</p>
                        </section>
                        <hr/>
                    </>
                )
            })}

        </>
    )
}

export default App
