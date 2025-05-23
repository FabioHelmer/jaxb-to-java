# 🛠️ JaxbToJava – Gerador de Classes Java a partir de XSD (eSocial)

Este projeto automatiza a geração de classes Java com base nos arquivos XSD utilizados pelo **eSocial**, utilizando o `xjc` (XML Java Compiler) da especificação JAXB.

Ao executar o script Python, todos os arquivos `.xsd` localizados em um diretório são processados e transformados em classes Java organizadas por pacotes específicos com base no tipo de evento eSocial correspondente.

---

## 🚀 Funcionalidades

- 🔁 Processa automaticamente todos os arquivos `.xsd` de uma pasta.
- 📦 Cria pacotes Java organizados por número do evento eSocial (ex: `OUT.S2200`).
- 📑 Gera log de erros durante o processo (`log.txt`).
- 🔔 Exibe notificação ao final da execução no Windows (via `winotify`).

---

## 📂 Estrutura Esperada

```
.
├── XSD/
│   └── nt032025/               # Pasta com arquivos XSD
├── log.txt                     # Log de erros da execução
├── script.py                   # Script principal
└── README.md                   # Este arquivo
```

---

## 📋 Pré-requisitos

- Python 3.7+
- Java (JDK 8 ou superior) com `xjc` instalado e disponível no PATH
- Instalar bibliotecas Python necessárias:

```bash
pip install winotify
```

---

## ⚙️ Como Usar

1. Coloque seus arquivos `.xsd` na pasta `XSD/nt032025`.
2. Execute o script:

```bash
python script.py
```

3. Verifique os pacotes gerados (`OUT.Sxxxx`) e o arquivo `log.txt` para eventuais erros.

---

## 📚 Mapeamento de Eventos eSocial

O script já contém um dicionário com os principais arquivos `.xsd` e seus respectivos códigos de evento eSocial. Exemplo:

```python
dicionario["evtAdmissao.xsd"] = 2200
dicionario["evtDeslig.xsd"] = 2299
...
```

Caso um arquivo `.xsd` não esteja no dicionário, o script criará o pacote com base no nome do arquivo.

---

## 🧩 Tecnologias Utilizadas

- Python
- subprocess / os
- Java `xjc`
- winotify (notificação para Windows)

---

## 👨‍💻 Autor

**Fabio Helmer Kuhn**

Se você achou este projeto útil, considere dar uma ⭐ no repositório!

---

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
