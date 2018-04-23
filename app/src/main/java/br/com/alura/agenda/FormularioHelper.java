package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.model.Aluno;

/**
 * Created by Luiz Felipe on 17/04/2018.
 */

public class FormularioHelper {

    private final EditText nome;
    private final EditText endereco;
    private final EditText telefone;
    private final EditText email;
    private final RatingBar nota;

    private Aluno aluno;

    public FormularioHelper(FormularioActivity formularioActivity) {

        nome     = (EditText)  formularioActivity.findViewById(R.id.formulario_nome);
        endereco = (EditText)  formularioActivity.findViewById(R.id.formulario_endereco);
        telefone = (EditText)  formularioActivity.findViewById(R.id.formulario_telefone);
        email    = (EditText)  formularioActivity.findViewById(R.id.formulario_email);
        nota     = (RatingBar) formularioActivity.findViewById(R.id.formulario_nota);
        aluno = new Aluno();

    }

    public Aluno pegaAluno() {
        aluno.setNome(nome.getText().toString());
        aluno.setEndereco(endereco.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        aluno.setEmail(email.getText().toString());
        aluno.setNota(Double.valueOf(nota.getProgress()));
        return aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        nome.setText(aluno.getNome());
        endereco.setText(aluno.getEndereco());
        telefone.setText(aluno.getTelefone());
        email.setText(aluno.getEmail());
        nota.setProgress(aluno.getNota().intValue());
        this.aluno = aluno;

    }
}
//tirei o teste coloquei isso aqui!