import {Kitab} from "./Kitab.ts";

export type Fatwa = {
    id: string,
    title: string,
    arabicTitle: string,
    quranReference: string,
    description: string,
    kitab: Kitab,
    footnotes: string[]
}