# simpleMicroservice

Microserviços

Prós:

1) <b>Manutenção e evolução dos serviços mais estáveis</b> -> Os desenvolvedores tratarão de códigos que executam uma única função, e cada serviço individual não cresce indefinidamente com o crescimento do sistema.
2) <b>Serviços com baixo nível de acoplamento e interdependência</b> -> Dessa forma, a manutenção em um serviço não interfere diretamente em outras funcionalidades do sistema.
3) <b>Escalabilidade do sistema</b> -> É obtida com o deploy e replicação de micro serviços através da infraestrutura de servidores, máquinas virtuais e containers de forma independente. Isso torna o crescimento e a possibilidade de adaptação do sistema muito mais flexível.
4) <b>Redução de custos</b> -> Como cada aplicação só utiliza os serviços de que necessita, os custos são diretamente associados à funcionalidade e à carga de uso do sistema, não sendo necessário carregar custos associados a funcionalidades não utilizadas.
5) <b>Flexibilidade de tecnologia</b> -> Não é necessário amarrar os desenvolvedores a uma tecnologia específica, pois há baixo acoplamento entre os serviços. Dessa forma, pode ser utilizada a melhor tecnologia para atender a cada caso, além da possibilidade de evoluir o sistema continuamente, diminuindo o risco da obsolescência tecnológica.
6) <b>Facilidade de colocar alterações em produção</b> -> As mudanças no sistema são feitas através das alterações e evoluções feitas nos serviços. Assim, não existe um sistema que precisa ser reinicializado para continuar funcionando. O time de desenvolvimento que precisará acompanhar a mudança será o time responsável pelos serviços que estão sendo alterados.


Contras:

1) <b> Complexidade da infraestrutura </b> -> Surge o Kubernets para atacar esse problema
2) <b> Complexidade na comunicação entre microserviços </b> -> Surge o Apche Kafka (Plataforma de streaming distribuida) para atacar esse problema
