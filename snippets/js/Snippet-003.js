
import { PrintWriter } from './lib/PrintWriter'

function main() {
    let écrivain = new PrintWriter("customer-01")
    écrire(écrivain, "firstname", "Olivier")
    écrire(écrivain, "lastname", "PEREZ")
    écrivain.close()
}

function écrire(output, key, value) {
    output.write(`${key}(${typeof value})=${value}`)
}