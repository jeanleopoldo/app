package com.aula.cbfapp.app.news;

public class NewsCreation {

    private NewsHandler nh;
    public NewsCreation(NewsHandler newsHandler) {
        this.nh = newsHandler;

        createNews();
        setupNews();
    }



    private void createNews() {
        News news;

        for (int i = 0; i < 6; i++) {
            news = new News(null, null,null);
            this.nh.addNews(news);
        }

    }

    private void setupNews() {
        News news;

        news = this.nh.getNewsList().get(0);
        news.setTitle("Arena Rostov: conheça o palco da estreia da Seleção na Copa do Mundo");
        news.setSubTitle("Construído especialmente para a Copa do Mundo FIFA Rússia 2018, o estádio vai receber cinco partidas ao longo do Mundial");
        news.setBody("Neste domingo (17), a Seleção Brasileira estreia na Copa do Mundo FIFA Rússia 2018 contra a Suíça. A partida, marcada para às 15h (de Brasília - 21h na hora local), tem como palco a Arena Rostov, situada na cidade de Rostov-on-Don. Erguido especialmente para o Mundial, o estádio, com capacidade para 45 mil espectadores, é um dos maiores legados deixados pela Copa para a Região Sul da Rússia. Após a competição, a Arena Rostov será a casa do FC Rostov, clube da cidade e um dos mais tradicionais do futebol russo. A arquitetura da Arena Rostov é encantadora: uma joia cravada na margem esquerda do rio Don, voltada para a pitoresca cidade de Rostov-on-Don. Com cinco andares, a fachada da arena é facetada por gigantescos vitrais, iluminados por incontáveis painéis de LED. As armações metálicas ajudam a harmonizar a estrutura, que se encaixa suavemente na paisagem. A cobertura do estádio simula as ondulações observadas nas águas do rio Don, que margeia e corta a cidade. A Arena Rostov vai receber cinco partidas ao longo da Copa do Mundo: além do confronto entre Brasil e Suíça neste domingo, o estádio vai receber outros três jogos da Fase de Grupos: Uruguai x Arábia Saudita (20/06 - 12h de Brasília / 18h na hora local), Coreia do Sul x México (23/06 - 12h de Brasília / 18h na hora local) e Islândia e Croácia (26/06 - 15h de Brasília / 21h no horário local). Na Fase Final, o primeiro colocado do Grupo G e o segundo lugar do Grupo H se enfrentam na Arena Rostov em uma das partidas das Oitavas de Final do Mundial. Uma cidade portuária com 1,125 milhão de habitantes, Rostov-on-Don (ou simplesmente Rostov) é a 10ª mais populosa do país. Epicentro da Região Sul da Rússia, é historicamente um ponto estratégico nas rotas comerciais que ligam o sudoeste do país a Moscou, capital russa e a 1.109km de Rostov. A imponente presença do rio Don influencia grande parte dos costumes, atividades e estilo de vida de Rostov-on-Don. Um emergente pólo cosmopolita, a cidade cativa os turistas por suas múltiplas manifestações culturais, rica história e pela atmosfera modernizada e dinâmica.");


        news = this.nh.getNewsList().get(1);
        news.setTitle("Seleção Brasileira: tudo sobre as estreias em Copas do Mundo");
        news.setSubTitle("Seleção Brasileira tem um retrospecto arrasador em suas estreias na Copa do Mundo: 16 vitórias, dois empates e apenas duas derrotas, com 46 gols marcados");
        news.setBody("Foi longa a espera. A saudade já se tornava incômoda. Desde o último momento juntos, se passaram 1.466 dias, contados com enorme ansiedade pelos mais de 200 milhões de torcedores brasileiros. Mas, é chegada a hora: a Seleção Brasileira volta aos gramados de um Mundial neste domingo (17), às 15h (de Brasília - 21h no horário local), contra a Suíça, na Arena Rostov, em Rostov-on-Don. \r\n" +
                "\r\n" +
                "A tão antecipada estreia na Copa do Mundo FIFA Rússia 2018 marca um recorde absoluto da Amarelinha. Por ser o único país a participar de todos os Mundiais, o Brasil disputa sua 21ª partida inicial na competição. O retrospecto da Verde e Amarela é arrasador nestes confrontos: nas 20 estreias anteriores, foram 16 vitórias, dois empates e apenas duas derrotas. Os reveses vieram nas duas primeiras participações brasileiras em Copas: perdeu para a Iugoslávia por 2 a 1 em 1930, e para a Espanha por 3 a 1 em 1934. \r\n" +
                "\r\n" +
                "De lá para cá, uma invencibilidade que completa 80 anos neste Mundial. Para se ter noção do incrível desempenho da Seleção em seus jogos iniciais em Copas do Mundo, o Brasil vem enfileirando vitórias nas últimas nove edições do torneio. Se derrotar a Suíça, a Verde e Amarela chega ao décimo triunfo seguido em estreias nas Copas. \r\n" +
                "\r\n" +
                "Se começar com o pé direito é tradição brasileira em Copas do Mundo, não poderia haver tradução mais literal deste histórico do que o inacreditável número de gols marcados pela Seleção em suas partidas de estreia. Em 20 jogos, a Canarinho balançou a rede 46 vezes. O resultado é a extraordinária média de 2,3 tentos por confronto. A Verde e Amarela só passou em branco contra a Iugoslávia, em 1974, quando as seleções empataram em 0 a 0. No retrospecto brasileiro em seus duelos de abertura em Mundiais, estão memoráveis estreias. Em 1938, no primeiro Mundial organizado pela França, uma vitória por 6 a 5 sobre a Polônia, o duelo de abertura com mais gols marcados pelos brasileiros. Já na Copa de 1954, na Suíça, o Brasil venceu por 5 a 0 o México, a maior goleada da Verde e Amarela em um jogo inicial.\r\n" +
                "\r\n" +
                "E como onde há gol, há um artilheiro, a Seleção tem grandes goleadores com exibições memoráveis para celebrar em suas estreias. O recordista é ninguém menos que Leônidas da Silva, o Diamante Negro. Com tentos nos Mundiais de 1934 e 1938, Leônidas anotou quatro gols em estreias da Canarinho em Copas do Mundo: um contra a Espanha, em 1934, e um incrível hat-trick em cima da Polônia, em 1938. Na sequência, o Rei: nas partidas iniciais das Copas de 1962, 1966 e 1970, Pelé balançou as redes uma vez, somando três gols em estreias da Verde e Amarela em Copas. Em seguida, diversos craques brasileiros que marcaram dois gols nos primeiros jogos em Mundiais: Perácio (1938), Ademir Menezes (1950), Baltazar (1950 e 1954), Pinga (1954), Mazzola (1958), Jairzinho (1970), Sócrates (1982 e 1986), Careca (1990) e… Neymar Jr. O camisa 10 da Seleção pode, neste domingo, aumentar seus números em estreias e, quem sabe, igualar ou até ultrapassar o inesquecível Leônidas da Silva.\r\n" +
                "\r\n" +
                "Neste domingo, a Seleção tem pela frente a Suíça em sua estreia na Copa do Mundo FIFA 2018. Esta é a primeira vez que os países se enfrentam em suas partidas de abertura em Mundiais. O adversário mais comum da Verde e Amarela nestes duelos é o México, rival nas estreias das Copas de 1950, 1954 e 1962. \r\n" +
                "\r\n" +
                "Depois de tantos números e informações sobre a Seleção Brasileira em estreias nas Copas do Mundo, não faltarão palpites aos torcedores de todo o mundo sobre o jogo deste domingo contra a Suíça. Então, aí vai mais um dado curioso da Verde e Amarela: o placar mais vezes registrado em partidas iniciais do Brasil é a vitória por 2 a 1. Foram cinco as oportunidades em que a Verde e Amarela bateu seus primeiros adversários em um Mundial por esse resultado: URSS (1982), Suécia (1990), Escócia (1998), Turquia (2002) e Coréia do Norte (2010). Por falar na Escócia, o único gol contra a favor da Seleção na história do Mundiais foi marcado justamente na estreia da Amarelinha na Copa do Mundo de 1998, contra os escoceses.\r\n" +
                "\r\n" +
                "Além da estreia deste domingo, a Seleção Brasileira tem pela frente mais duas partidas pela Primeira Fase da Copa do Mundo FIFA Rússia 2018. Na próxima sexta-feira (22), o Brasil vai a campo contra a Costa Rica, às 9h (de Brasília - 15h no horário local), em São Petersburgo. Depois, a Canarinho enfrenta a Sérvia às 15h (de Brasília - 21h na hora local), em Moscou, e encerra a participação na Fase de Grupos do Mundial.");

        news = this.nh.getNewsList().get(2);
        news.setTitle("Ronaldo visita a Seleção Brasileira e pede: 'tenham tranquilidade'");
        news.setSubTitle("Jogador esteve no hotel da Seleção Brasileira em Rostov, neste sábado, e conversou com jogadores e membros da comissão técnica");
        news.setBody("Quatro Copas do Mundo no currículo, dois títulos mundiais, um vice-campeonato. Se tem alguém que entende o que é disputar a competição mais importante do planeta, esse cara é Ronaldo Fenômeno. Na noite deste sábado (16), o ex-camisa 9 da Seleção Brasileira aproveitou a estadia em Rostov para visitar o grupo brasileiro e compartilhar a sua experiência.\r\n" +
                "\r\n" +
                "No Hotel Ramada, onde se encontra a equipe, Ronaldo aproveitou para conversar com alguns jogadores e membros da comissão técnica. A principal mensagem do jogador para a estreia foi: \"tenham tranquilidade\".\r\n" +
                "\r\n" +
                "– Quando o grupo fecha mesmo, como estamos vendo agora, é que temos chance de ganhar. Estou muito feliz com o que estou vendo e torcendo demais por vocês – disse Ronaldo, com olhar em direção ao técnico da Seleção, Tite.\r\n" +
                "\r\n" +
                "Quando ainda era jogador, Ronaldo foi treinado pelo atual comandante da Seleção. Também foi parceiro do coordenador de Seleções, Edu Gaspar, na Seleção e no Corinthians, quando os dois ainda eram jogadores; além de ter trabalhado com boa parte dos membros desta comissão técnica.\r\n" +
                "\r\n" +
                "Fãs de Ronaldo, alguns jogadores fizeram questão de registrar o momento. Marcelo, Gabriel Jesus, Neymar... A lista foi grande. Todos ouviram o mesmo conselho e de forma atenta. Afinal de contas, não é todo dia que um ídolo aparece para demonstrar apoio e dizer que está na torcida. Que nossa estreia seja tranquila. Obrigado, Ronaldo!\r\n" +
                "\r\n" +
                "Em campo, a Seleção Brasileira estreia na Copa do Mundo contra a Suíça neste domingo (17), na Arena Rostov. A bola rola às 21h (15h de Brasília).");

        news = this.nh.getNewsList().get(3);
        news.setTitle("Marcelo será o capitão da Seleção Brasileira na estreia");
        news.setSubTitle("Lateral volta a receber a braçadeira sob o comando do técnico Tite. A primeira vez foi na vitória por 2 a 0 sobre o Equador nas Eliminatórias");
        news.setBody("Marcelo será o capitão da Seleção Brasileira na partida de estreia na Copa do Mundo da Rússia. O técnico Tite confirmou a braçadeira para o lateral esquerdo neste sábado (16), véspera do confronto com a Suíça. O jogador já havia usado a braçadeira uma vez sob o comando do treinador. Foi na vitória por 2 a 0 em cima do Equador, em 2017, em jogo válido pelas Eliminatórias. Algo que ele considera normal, já que exerce a função em seu clube, o Real Madrid.\r\n" +
                "\r\n" +
                "– Virei terceiro capitão do Real Madrid aos 24 anos, depois me tornei o segundo com apenas 26. É uma situação que eu gosto, pois sinto que tenho algo a passar. Todos aqui exercem algum tipo de liderança, mas o tempo te dá experiência. Com 30 anos, o que eu já vivi no futebol, acho que tenho algo a acrescentar – analisou Marcelo.\r\n" +
                "\r\n" +
                "Escalado para a coletiva de imprensa pré-jogo, como geralmente acontece com os capitães no comando de Tite, Marcelo ainda aproveitou para relembrar os sonhos de quando era criança e ainda vivia a emoção de torcedor.\r\n" +
                "\r\n" +
                "– Quando eu jogava bola na rua, na areia, eu sonhava em um dia estar aqui. Hoje, eu posso representar meu país numa Copa do Mundo e ainda ser o capitão na estreia. Isso não tem preço – definiu.\r\n" +
                "\r\n" +
                "A Seleção Brasileira entra em campo contra a Suíça às 21h (15h no horário de Brasília) na Arena Rostov. ");

        news = this.nh.getNewsList().get(4);
        news.setTitle("Jogadores da Seleção Brasileira aprovam gramado da Arena Rostov");
        news.setSubTitle("Após o treino deste sábado, quando conheceram o palco da estreia, os atletas comentaram sobre a qualidade do gramado");
        news.setBody("Um dos principais ingredientes do espetáculo futebol é o gramado. E neste quesito, a Arena Rostov, palco da estreia da Seleção Brasileira na Copa do Mundo, foi aprovada. Após o treinamento deste sábado (16), quando conheceram o estádio, os jogadores comentaram sobre a qualidade do campo.\r\n" +
                "\r\n" +
                "– Com uma molhadinha antes do jogo fica ideal. Vai contribuir para um bom jogo – comentou o zagueiro Miranda.\r\n" +
                "\r\n" +
                "Com capacidade para 45 mil pessoas, a Arena Rostov foi inaugurada neste ano. Segundo informações da FIFA, as arquibancadas estarão lotadas para acompanhar o duelo entre Brasil e Suíça.\r\n" +
                "\r\n" +
                "– Bem cortado, a bola está correndo e a arquibancada ainda ficou bem bonita – disse Willian.\r\n" +
                "\r\n" +
                "Neste domingo (17), o pontapé inicial está marcado para as 21h (15h de Brasília). Além de Brasil e Suíça, o Grupo E ainda conta com Sérvia e Costa Rica, que se enfrentam um pouco mais cedo: às 15h (9h de Brasília), em Samara.");

        news = this.nh.getNewsList().get(5);
        news.setTitle("Seleção Brasileira conhece palco da estreia na Copa");
        news.setSubTitle("Por uma hora exata, os jogadores da Seleção Brasileira treinaram no estádio que receberá Brasil x Suíça, pela primeira rodada do Grupo E");
        news.setBody("Como de praxe no futebol e principalmente em eventos FIFA, a véspera de uma partida é separada para conhecer o estádio que receberá o confronto. Foi o que aconteceu neste sábado (16) para a Seleção Brasileira, que treinou na Arena Rostov.\r\n" +
                "\r\n" +
                "Por exatamente uma hora, contada em um cronômetro no telão do estádio, os jogadores da Seleção Brasileira puderam praticar no local. Tite comandou um trabalho tático, com bastante movimentação, por cerca de 20 minutos. Na sequência, o foco foi nas bolas paradas para aqueles que começarão jogando.\r\n" +
                "\r\n" +
                "O restante do grupo treinou com o auxiliar técnico Sylvinho. Cruzamentos, finalizações e muita cobrança, como estão acostumados em trabalhos com o ex-jogador.\r\n" +
                "\r\n" +
                "jogadores aprovam gramado\r\n" +
                "\r\n" +
                "Um dos principais ingredientes do espetáculo futebol é o gramado. E neste quesito, a Arena Rostov, palco da estreia da Seleção Brasileira na Copa do Mundo, foi aprovada. Após o treinamento deste sábado (16), quando conheceram o estádio, os jogadores comentaram sobre a qualidade do campo.\r\n" +
                "\r\n" +
                "– Com uma molhadinha antes do jogo fica ideal. Vai contribuir para um bom jogo – comentou o zagueiro Miranda.\r\n" +
                "\r\n" +
                "Com capacidade para 45 mil pessoas, a Arena Rostov foi inaugurada neste ano. Segundo informações da FIFA, as arquibancadas estarão lotadas para acompanhar o duelo entre Brasil e Suíça.\r\n" +
                "\r\n" +
                "– Bem cortado, a bola está correndo e a arquibancada ainda ficou bem bonita – disse Willian.\r\n" +
                "\r\n" +
                "Neste domingo (17), o pontapé inicial está marcado para as 21h (15h de Brasília). Além de Brasil e Suíça, o Grupo E ainda conta com Sérvia e Costa Rica, que se enfrentam um pouco mais cedo: às 15h (9h de Brasília), em Samara.\r\n" +
                "\r\n" +
                "Antes do Brasil, quem treinou na Arena Rostov foi a Suíça, adversária deste domingo (17). A bola rola para o duelo às 21 horas (15h de Brasília) e será válido pela primeira rodada do Grupo E, que ainda conta com Sérvia e Costa Rica.");
    }

}

