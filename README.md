# ⚔️ Sistema de Batalha entre Personagens

Projeto prático desenvolvido para consolidar os conceitos de **Programação Orientada a Objetos** em Java, com foco em **interfaces**, **herança**, **classes abstratas** e **polimorfismo**.

---

## 📌 Sobre o projeto

O sistema simula batalhas por turnos entre personagens de diferentes classes. Cada personagem possui atributos e comportamentos únicos, mas todos seguem o mesmo contrato definido pela interface `Combatente`.

---

## 🧱 Estrutura do projeto

```
src/
├── interfaces/
│   └── Combatente.java          # Interface com o contrato de combate
├── personagens/
│   ├── Personagem.java          # Classe abstrata base
│   ├── Guerreiro.java           # Dano alto, defesa alta
│   ├── Mago.java                # Dano altíssimo, defesa baixa
│   └── Arqueiro.java            # Dano médio, chance de acerto crítico
└── teste/
    └── Batalha.java             # Simulação das batalhas
```

---

## 🧩 Conceitos aplicados

| Conceito | Onde aparece |
|---|---|
| Interface | `Combatente.java` — define o contrato de combate |
| Classe abstrata | `Personagem.java` — comportamento compartilhado entre personagens |
| Herança | `Guerreiro`, `Mago` e `Arqueiro` estendem `Personagem` |
| Polimorfismo | `simularRodada(Personagem, Personagem)` — chama `atacar()` e `defender()` sem saber o tipo concreto |
| Encapsulamento | Atributos `private` e `protected` com acesso controlado |

---

## 🧙 Personagens

### Guerreiro
- Atributo extra: `forca`
- Alto dano e alta defesa
- `atacar()` → `forca * 2`
- `defender()` → `defesaBase * 2`

### Mago
- Atributo extra: `poderMagico`
- Dano altíssimo, defesa baixa
- `atacar()` → `poderMagico * 5`
- `defender()` → `defesaBase / 2`

### Arqueiro
- Atributo extra: `precisao`
- Dano médio com chance de acerto crítico
- `atacar()` → dano base ou dano dobrado dependendo da precisão
- `defender()` → `defesaBase`

---

## ⚙️ Como rodar

1. Baixe o repositorio
2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse, VS Code)
3. Execute a classe `Batalha.java`

---
