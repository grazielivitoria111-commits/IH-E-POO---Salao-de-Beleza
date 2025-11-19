public class App {
    public static void main(String[] args) {
    
        Cliente c1 = new Cliente("Ana Alves", "99999-0000", "ana@gmail.com");

        Servico s1 = new Servico("Corte de Cabelo", 50.0, 30);

        Profissional p1 = new Profissional("Marina Silva", "Cabeleireira");

        Agendamento ag1 = new Agendamento(c1, s1, p1, "19/11/2025", "14:00");

        p1.adicionarAgendamento(ag1);

        ag1.confirmar();

        
        System.out.println("Agendamento criado e confirmado!");
        System.out.println("Cliente: " + ag1.getCliente().getNome());
        System.out.println("Serviço: " + ag1.getServico().getNome());
        System.out.println("Profissional: " + ag1.getProfissional().getNome());
        System.out.println("Data: " + ag1.getData() + " às " + ag1.getHorario());

        System.out.println("\nHistórico do cliente:");
        System.out.println(c1.getHistorico());


        p1.listarAgendamentos();
    }
}
