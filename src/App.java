public class App {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana Alves", "99999-0000", "ana.alves@gmail.com");

        Servico s1 = new Servico("Corte de cabelo", 50.0, 30);

        Profissional p1 = new Profissional("Marina Silva", "Cabeleireira");

        Agendamento ag = new Agendamento(
                c1,
                s1,
                p1,
                "19/11/2025",
                "14:00"
        );

        p1.adicionarAgendamento(ag);

        System.out.println("Agendamento criado!");
        System.out.println("Cliente: " + ag.getCliente().getNome());
        System.out.println("Serviço: " + ag.getServico().getNome());
        System.out.println("Profissional: " + ag.getProfissional().getNome());
        System.out.println("Data: " + ag.getData() + " às " + ag.getHorario());
    }
}
