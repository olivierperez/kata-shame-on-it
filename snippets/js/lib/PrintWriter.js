export class PrintWriter {
    constructor(name) {
        this.name = name
        this.buffer = ''
    }

    write(string) {
        this.buffer += `[${this.name}] ${string}\n`
    }

    close () {
        console.log(this.buffer);
        this.buffer = ''
    }
}