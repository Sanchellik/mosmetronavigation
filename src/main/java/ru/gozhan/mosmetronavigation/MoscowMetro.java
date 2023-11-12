package ru.gozhan.mosmetronavigation;

import java.util.HashMap;
import java.util.Map;

public class MoscowMetro {

    private static final Map<Integer, MetroStation> STATIONS;
    public static final MetroGraph GRAPH;

    static {
        STATIONS = new HashMap<>();
        STATIONS.put(0, new MetroStation("1", "Бульвар Рокоссовского"));
        STATIONS.put(1, new MetroStation("1", "Черкизовская"));
        STATIONS.put(2, new MetroStation("1", "Преображенская площадь"));
        STATIONS.put(3, new MetroStation("1", "Сокольники"));
        STATIONS.put(4, new MetroStation("1", "Красносельская"));
        STATIONS.put(5, new MetroStation("1", "Комсомольская"));
        STATIONS.put(6, new MetroStation("1", "Красные ворота"));
        STATIONS.put(7, new MetroStation("1", "Чистые пруды"));
        STATIONS.put(8, new MetroStation("1", "Лубянка"));
        STATIONS.put(9, new MetroStation("1", "Охотный ряд"));
        STATIONS.put(10, new MetroStation("1", "Библиотека имени Ленина"));
        STATIONS.put(11, new MetroStation("1", "Кропоткинская"));
        STATIONS.put(12, new MetroStation("1", "Парк культуры"));
        STATIONS.put(13, new MetroStation("1", "Фрунзенская"));
        STATIONS.put(14, new MetroStation("1", "Спортивная"));
        STATIONS.put(15, new MetroStation("1", "Воробьёвы горы"));
        STATIONS.put(16, new MetroStation("1", "Университет"));
        STATIONS.put(17, new MetroStation("1", "Проспект Вернадского"));
        STATIONS.put(18, new MetroStation("1", "Юго-Западная"));
        STATIONS.put(19, new MetroStation("1", "Тропарёво"));
        STATIONS.put(20, new MetroStation("1", "Румянцево"));
        STATIONS.put(21, new MetroStation("1", "Саларьево"));
        STATIONS.put(22, new MetroStation("1", "Филатов Луг"));
        STATIONS.put(23, new MetroStation("1", "Прокшино"));
        STATIONS.put(24, new MetroStation("1", "Ольховая"));
        STATIONS.put(25, new MetroStation("1", "Коммунарка"));

        STATIONS.put(26, new MetroStation("2", "Ховрино"));
        STATIONS.put(27, new MetroStation("2", "Беломорская"));
        STATIONS.put(28, new MetroStation("2", "Речной вокзал"));
        STATIONS.put(29, new MetroStation("2", "Водный стадион"));
        STATIONS.put(30, new MetroStation("2", "Войковская"));
        STATIONS.put(31, new MetroStation("2", "Сокол"));
        STATIONS.put(32, new MetroStation("2", "Аэропорт"));
        STATIONS.put(33, new MetroStation("2", "Динамо"));
        STATIONS.put(34, new MetroStation("2", "Белорусская"));
        STATIONS.put(35, new MetroStation("2", "Маяковская"));
        STATIONS.put(36, new MetroStation("2", "Тверская"));
        STATIONS.put(37, new MetroStation("2", "Театральная"));
        STATIONS.put(38, new MetroStation("2", "Новокузнецкая"));
        STATIONS.put(39, new MetroStation("2", "Павелецкая"));
        STATIONS.put(40, new MetroStation("2", "Автозаводская"));
        STATIONS.put(41, new MetroStation("2", "Технопарк"));
        STATIONS.put(42, new MetroStation("2", "Коломенская"));
        STATIONS.put(43, new MetroStation("2", "Каширская"));
        STATIONS.put(44, new MetroStation("2", "Кантемировская"));
        STATIONS.put(45, new MetroStation("2", "Царицыно"));
        STATIONS.put(46, new MetroStation("2", "Орехово"));
        STATIONS.put(47, new MetroStation("2", "Домодедовская"));
        STATIONS.put(48, new MetroStation("2", "Красногвардейская"));
        STATIONS.put(49, new MetroStation("2", "Алма-Атинская"));

        STATIONS.put(50, new MetroStation("3", "Щелковская"));
        STATIONS.put(51, new MetroStation("3", "Первомайская"));
        STATIONS.put(52, new MetroStation("3", "Измайловская"));
        STATIONS.put(53, new MetroStation("3", "Партизанская"));
        STATIONS.put(54, new MetroStation("3", "Семёновская"));
        STATIONS.put(55, new MetroStation("3", "Электрозаводская"));
        STATIONS.put(56, new MetroStation("3", "Бауманская"));
        STATIONS.put(57, new MetroStation("3", "Курская"));
        STATIONS.put(58, new MetroStation("3", "Площадь Революции"));
        STATIONS.put(59, new MetroStation("3", "Арбатская"));
        STATIONS.put(60, new MetroStation("3", "Смоленская"));
        STATIONS.put(61, new MetroStation("3", "Киевская"));
        STATIONS.put(62, new MetroStation("3", "Парк Победы"));
        STATIONS.put(63, new MetroStation("3", "Славянский бульвар"));
        STATIONS.put(64, new MetroStation("3", "Кунцевская"));
        STATIONS.put(65, new MetroStation("3", "Молодёжная"));
        STATIONS.put(66, new MetroStation("3", "Крылатское"));
        STATIONS.put(67, new MetroStation("3", "Строгино"));
        STATIONS.put(68, new MetroStation("3", "Мякинино"));
        STATIONS.put(69, new MetroStation("3", "Волоколамская"));
        STATIONS.put(70, new MetroStation("3", "Митино"));
        STATIONS.put(71, new MetroStation("3", "Пятницкое шоссе"));

        STATIONS.put(72, new MetroStation("4", "Кунцевская"));
        STATIONS.put(73, new MetroStation("4", "Пионерская"));
        STATIONS.put(74, new MetroStation("4", "Филёвский парк"));
        STATIONS.put(75, new MetroStation("4", "Багратионовская"));
        STATIONS.put(76, new MetroStation("4", "Фили"));
        STATIONS.put(77, new MetroStation("4", "Кутузовская"));
        STATIONS.put(78, new MetroStation("4", "Студенческая"));
        STATIONS.put(80, new MetroStation("4", "Смоленская"));
        STATIONS.put(81, new MetroStation("4", "Арбатская"));
        STATIONS.put(82, new MetroStation("4", "Александровский сад"));

        STATIONS.put(83, new MetroStation("4A", "Киевская"));
        STATIONS.put(84, new MetroStation("4A", "Выставочная"));
        STATIONS.put(85, new MetroStation("4A", "Международная"));

        STATIONS.put(86, new MetroStation("5", "Киевская"));
        STATIONS.put(87, new MetroStation("5", "Парк культуры"));
        STATIONS.put(88, new MetroStation("5", "Октябрьская"));
        STATIONS.put(89, new MetroStation("5", "Добрынинская"));
        STATIONS.put(90, new MetroStation("5", "Павелецкая"));
        STATIONS.put(91, new MetroStation("5", "Таганская"));
        STATIONS.put(92, new MetroStation("5", "Курская"));
        STATIONS.put(93, new MetroStation("5", "Комсомольская"));
        STATIONS.put(94, new MetroStation("5", "Проспект Мира"));
        STATIONS.put(95, new MetroStation("5", "Новослободская"));
        STATIONS.put(96, new MetroStation("5", "Белорусская"));
        STATIONS.put(97, new MetroStation("5", "Краснопресненская"));

        STATIONS.put(98, new MetroStation("6", "Медведково"));
        STATIONS.put(99, new MetroStation("6", "Бабушкинская"));
        STATIONS.put(100, new MetroStation("6", "Свиблово"));
        STATIONS.put(101, new MetroStation("6", "Ботанический сад"));
        STATIONS.put(102, new MetroStation("6", "ВДНХ"));
        STATIONS.put(103, new MetroStation("6", "Алексеевская"));
        STATIONS.put(104, new MetroStation("6", "Рижская"));
        STATIONS.put(105, new MetroStation("6", "Проспект Мира"));
        STATIONS.put(106, new MetroStation("6", "Сухаревская"));
        STATIONS.put(107, new MetroStation("6", "Тургеневская"));
        STATIONS.put(108, new MetroStation("6", "Китай-город"));
        STATIONS.put(109, new MetroStation("6", "Третьяковская"));
        STATIONS.put(110, new MetroStation("6", "Октябрьская"));
        STATIONS.put(111, new MetroStation("6", "Шаболовская"));
        STATIONS.put(112, new MetroStation("6", "Ленинский проспект"));
        STATIONS.put(113, new MetroStation("6", "Академическая"));
        STATIONS.put(114, new MetroStation("6", "Профсоюзная"));
        STATIONS.put(115, new MetroStation("6", "Новые Черёмушки"));
        STATIONS.put(116, new MetroStation("6", "Калужская"));
        STATIONS.put(117, new MetroStation("6", "Беляево"));
        STATIONS.put(118, new MetroStation("6", "Коньково"));
        STATIONS.put(119, new MetroStation("6", "Тёплый Стан"));
        STATIONS.put(120, new MetroStation("6", "Ясенево"));
        STATIONS.put(121, new MetroStation("6", "Новоясеневская"));

        STATIONS.put(122, new MetroStation("7", "Планерная"));
        STATIONS.put(123, new MetroStation("7", "Сходненская"));
        STATIONS.put(124, new MetroStation("7", "Тушинская"));
        STATIONS.put(125, new MetroStation("7", "Щукинская"));
        STATIONS.put(126, new MetroStation("7", "Октябрьское поле"));
        STATIONS.put(127, new MetroStation("7", "Полежаевская"));
        STATIONS.put(128, new MetroStation("7", "Беговая"));
        STATIONS.put(129, new MetroStation("7", "Улица 1905 года"));
        STATIONS.put(130, new MetroStation("7", "Баррикадная"));
        STATIONS.put(131, new MetroStation("7", "Пушкинская"));
        STATIONS.put(132, new MetroStation("7", "Кузнецкий мост"));
        STATIONS.put(133, new MetroStation("7", "Китай-город"));
        STATIONS.put(134, new MetroStation("7", "Таганская"));
        STATIONS.put(135, new MetroStation("7", "Пролетарская"));
        STATIONS.put(136, new MetroStation("7", "Волгоградский проспект"));
        STATIONS.put(137, new MetroStation("7", "Текстильщики"));
        STATIONS.put(138, new MetroStation("7", "Кузьминки"));
        STATIONS.put(139, new MetroStation("7", "Рязанский проспект"));
        STATIONS.put(140, new MetroStation("7", "Выхино"));
        STATIONS.put(141, new MetroStation("7", "Лермонтовский проспект"));
        STATIONS.put(142, new MetroStation("7", "Жулебино"));
        STATIONS.put(143, new MetroStation("7", "Котельники"));

        STATIONS.put(144, new MetroStation("8", "Новокосино"));
        STATIONS.put(145, new MetroStation("8", "Новогиреево"));
        STATIONS.put(146, new MetroStation("8", "Перово"));
        STATIONS.put(147, new MetroStation("8", "Шоссе Энтузиастов"));
        STATIONS.put(148, new MetroStation("8", "Авиамоторная"));
        STATIONS.put(149, new MetroStation("8", "Площадь Ильича"));
        STATIONS.put(150, new MetroStation("8", "Марксистская"));
        STATIONS.put(151, new MetroStation("8", "Третьяковская"));

        STATIONS.put(152, new MetroStation("8А", "Деловой центр"));
        STATIONS.put(153, new MetroStation("8А", "Парк Победы"));
        STATIONS.put(154, new MetroStation("8А", "Минская"));
        STATIONS.put(155, new MetroStation("8А", "Ломоносовский проспект"));
        STATIONS.put(156, new MetroStation("8А", "Раменки"));
        STATIONS.put(157, new MetroStation("8А", "Мичуринский проспект"));
        STATIONS.put(158, new MetroStation("8А", "Озёрная"));
        STATIONS.put(159, new MetroStation("8А", "Говорово"));
        STATIONS.put(160, new MetroStation("8А", "Солнцево"));
        STATIONS.put(161, new MetroStation("8А", "Боровское шоссе"));
        STATIONS.put(162, new MetroStation("8А", "Новопеределкино"));
        STATIONS.put(163, new MetroStation("8А", "Рассказовка"));
        STATIONS.put(164, new MetroStation("8А", "Пыхтино"));
        STATIONS.put(165, new MetroStation("8А", "Аэропорт Внуково"));


        STATIONS.put(172, new MetroStation("9", "Алтуфьево"));
        STATIONS.put(173, new MetroStation("9", "Бибирево"));
        STATIONS.put(174, new MetroStation("9", "Отрадное"));
        STATIONS.put(175, new MetroStation("9", "Владыкино"));
        STATIONS.put(176, new MetroStation("9", "Петровско-Разумовская"));
        STATIONS.put(177, new MetroStation("9", "Тимирязевская"));
        STATIONS.put(178, new MetroStation("9", "Дмитровская"));
        STATIONS.put(179, new MetroStation("9", "Савёловская"));
        STATIONS.put(180, new MetroStation("9", "Менделеевская"));
        STATIONS.put(181, new MetroStation("9", "Цветной бульвар"));
        STATIONS.put(182, new MetroStation("9", "Чеховская"));
        STATIONS.put(183, new MetroStation("9", "Боровицкая"));
        STATIONS.put(184, new MetroStation("9", "Полянка"));
        STATIONS.put(185, new MetroStation("9", "Серпуховская"));
        STATIONS.put(186, new MetroStation("9", "Тульская"));
        STATIONS.put(187, new MetroStation("9", "Нагатинская"));
        STATIONS.put(188, new MetroStation("9", "Нагорная"));
        STATIONS.put(189, new MetroStation("9", "Нахимовский проспект"));
        STATIONS.put(190, new MetroStation("9", "Севастопольская"));
        STATIONS.put(191, new MetroStation("9", "Чертановская"));
        STATIONS.put(192, new MetroStation("9", "Южная"));
        STATIONS.put(193, new MetroStation("9", "Пражская"));
        STATIONS.put(194, new MetroStation("9", "Улица академика Янгеля"));
        STATIONS.put(195, new MetroStation("9", "Аннино"));
        STATIONS.put(196, new MetroStation("9", "Бульвар Дмитрия Донского"));

        STATIONS.put(197, new MetroStation("10", "Физтех"));
        STATIONS.put(198, new MetroStation("10", "Лианозово"));
        STATIONS.put(199, new MetroStation("10", "Яхромская"));
        STATIONS.put(200, new MetroStation("10", "Селигерская"));
        STATIONS.put(201, new MetroStation("10", "Верхние Лихоборы"));
        STATIONS.put(202, new MetroStation("10", "Окружная"));
        STATIONS.put(203, new MetroStation("10", "Петровско-Разумовская"));
        STATIONS.put(204, new MetroStation("10", "Фонвизинская"));
        STATIONS.put(205, new MetroStation("10", "Бутырская"));
        STATIONS.put(206, new MetroStation("10", "Марьина Роща"));
        STATIONS.put(207, new MetroStation("10", "Достоевская"));
        STATIONS.put(208, new MetroStation("10", "Трубная"));
        STATIONS.put(209, new MetroStation("10", "Сретенский бульвар"));
        STATIONS.put(210, new MetroStation("10", "Чкаловская"));
        STATIONS.put(211, new MetroStation("10", "Римская"));
        STATIONS.put(212, new MetroStation("10", "Крестьянская застава"));
        STATIONS.put(213, new MetroStation("10", "Дубровка"));
        STATIONS.put(214, new MetroStation("10", "Кожуховская"));
        STATIONS.put(215, new MetroStation("10", "Печатники"));
        STATIONS.put(216, new MetroStation("10", "Волжская"));
        STATIONS.put(217, new MetroStation("10", "Люблино"));
        STATIONS.put(218, new MetroStation("10", "Братиславская"));
        STATIONS.put(219, new MetroStation("10", "Марьино"));
        STATIONS.put(220, new MetroStation("10", "Борисово"));
        STATIONS.put(221, new MetroStation("10", "Шипиловская"));
        STATIONS.put(222, new MetroStation("10", "Зябликово"));

        STATIONS.put(223, new MetroStation("11", "Хорошевская"));
        STATIONS.put(224, new MetroStation("11", "Петровский парк"));
        STATIONS.put(225, new MetroStation("11", "Савеловская"));
        STATIONS.put(226, new MetroStation("11", "Марьина роща"));
        STATIONS.put(227, new MetroStation("11", "Рижская"));
        STATIONS.put(228, new MetroStation("11", "Сокольники"));
        STATIONS.put(229, new MetroStation("11", "Электрозаводская"));
        STATIONS.put(230, new MetroStation("11", "Лефортово"));
        STATIONS.put(231, new MetroStation("11", "Авиамоторная"));
        STATIONS.put(232, new MetroStation("11", "Нижегородская"));
        STATIONS.put(233, new MetroStation("11", "Текстильщики"));
        STATIONS.put(234, new MetroStation("11", "Печатники"));
        STATIONS.put(235, new MetroStation("11", "Нагатинский затон"));
        STATIONS.put(236, new MetroStation("11", "Кленовый бульвар"));
        STATIONS.put(237, new MetroStation("11", "Каширская"));
        STATIONS.put(238, new MetroStation("11", "Варшавская"));
        STATIONS.put(239, new MetroStation("11", "Каховская"));
        STATIONS.put(240, new MetroStation("11", "Зюзино"));
        STATIONS.put(241, new MetroStation("11", "Воронцовская"));
        STATIONS.put(242, new MetroStation("11", "Новаторская"));
        STATIONS.put(243, new MetroStation("11", "Проспект Вернадского"));
        STATIONS.put(244, new MetroStation("11", "Мичуринский проспект"));
        STATIONS.put(245, new MetroStation("11", "Аминьевская"));
        STATIONS.put(246, new MetroStation("11", "Давыдково"));
        STATIONS.put(247, new MetroStation("11", "Кунцевская"));
        STATIONS.put(248, new MetroStation("11", "Терехово"));
        STATIONS.put(249, new MetroStation("11", "Мневники"));
        STATIONS.put(250, new MetroStation("11", "Народное ополчение"));

        STATIONS.put(435, new MetroStation("11А", "ЦСКА"));
        STATIONS.put(251, new MetroStation("11А", "Хорошевская"));
        STATIONS.put(252, new MetroStation("11А", "Шелепиха"));
        STATIONS.put(253, new MetroStation("11А", "Деловой центр"));

        STATIONS.put(254, new MetroStation("12", "Бунинская аллея"));
        STATIONS.put(255, new MetroStation("12", "Улица Горчакова"));
        STATIONS.put(256, new MetroStation("12", "Бульвар Адмирала Ушакова"));
        STATIONS.put(257, new MetroStation("12", "Улица Скобелевская"));
        STATIONS.put(258, new MetroStation("12", "Улица Старокачаловская"));
        STATIONS.put(259, new MetroStation("12", "Лесопарковая"));
        STATIONS.put(260, new MetroStation("12", "Битцевский парк"));

        STATIONS.put(261, new MetroStation("14", "Окружная"));
        STATIONS.put(262, new MetroStation("14", "Владыкино"));
        STATIONS.put(263, new MetroStation("14", "Ботанический сад"));
        STATIONS.put(264, new MetroStation("14", "Ростокино"));
        STATIONS.put(265, new MetroStation("14", "Белокаменная"));
        STATIONS.put(266, new MetroStation("14", "Бульвар Рокоссовского"));
        STATIONS.put(267, new MetroStation("14", "Локомотив"));
        STATIONS.put(268, new MetroStation("14", "Измайлово"));
        STATIONS.put(436, new MetroStation("14", "Шоссе-Энтузиастов"));
        STATIONS.put(269, new MetroStation("14", "Соколиная гора"));
        STATIONS.put(270, new MetroStation("14", "Андроновка"));
        STATIONS.put(272, new MetroStation("14", "Новохохловская"));
        STATIONS.put(273, new MetroStation("14", "Угрешская"));
        STATIONS.put(274, new MetroStation("14", "Дубровка"));
        STATIONS.put(275, new MetroStation("14", "Автозаводская"));
        STATIONS.put(276, new MetroStation("14", "ЗИЛ"));
        STATIONS.put(277, new MetroStation("14", "Верхние Котлы"));
        STATIONS.put(278, new MetroStation("14", "Крымская"));
        STATIONS.put(279, new MetroStation("14", "Площадь Гагарина"));
        STATIONS.put(280, new MetroStation("14", "Лужники"));
        STATIONS.put(281, new MetroStation("14", "Кутузовская"));
        STATIONS.put(282, new MetroStation("14", "Деловой центр"));
        STATIONS.put(283, new MetroStation("14", "Шелепиха"));
        STATIONS.put(284, new MetroStation("14", "Хорошёво"));
        STATIONS.put(285, new MetroStation("14", "Зорге"));
        STATIONS.put(286, new MetroStation("14", "Панфиловская"));
        STATIONS.put(287, new MetroStation("14", "Стрешнево"));
        STATIONS.put(288, new MetroStation("14", "Балтийская"));
        STATIONS.put(289, new MetroStation("14", "Коптево"));
        STATIONS.put(290, new MetroStation("14", "Лихоборы"));

        STATIONS.put(291, new MetroStation("15", "Нижегородская"));
        STATIONS.put(292, new MetroStation("15", "Стахановская"));
        STATIONS.put(293, new MetroStation("15", "Окская"));
        STATIONS.put(294, new MetroStation("15", "Юго-Восточная"));
        STATIONS.put(295, new MetroStation("15", "Косино"));
        STATIONS.put(296, new MetroStation("15", "Улица Дмитриевского"));
        STATIONS.put(297, new MetroStation("15", "Лухмановская"));
        STATIONS.put(298, new MetroStation("15", "Некрасовка"));

        STATIONS.put(299, new MetroStation("D1", "Лобня"));
        STATIONS.put(300, new MetroStation("D1", "Шереметьевская"));
        STATIONS.put(301, new MetroStation("D1", "Хлебниково"));
        STATIONS.put(302, new MetroStation("D1", "Водники"));
        STATIONS.put(303, new MetroStation("D1", "Долгопрудная"));
        STATIONS.put(304, new MetroStation("D1", "Новодачная"));
        STATIONS.put(305, new MetroStation("D1", "Марк"));
        STATIONS.put(306, new MetroStation("D1", "Лианозово"));
        STATIONS.put(307, new MetroStation("D1", "Бескудниково"));
        STATIONS.put(308, new MetroStation("D1", "Дегунино"));
        STATIONS.put(309, new MetroStation("D1", "Окружная"));
        STATIONS.put(310, new MetroStation("D1", "Тимирязевская"));
        STATIONS.put(311, new MetroStation("D1", "Савёловская"));
        STATIONS.put(312, new MetroStation("D1", "Белорусская"));
        STATIONS.put(313, new MetroStation("D1", "Беговая"));
        STATIONS.put(314, new MetroStation("D1", "Тестовская"));
        STATIONS.put(315, new MetroStation("D1", "Фили"));
        STATIONS.put(316, new MetroStation("D1", "Славянский бульвар"));
        STATIONS.put(317, new MetroStation("D1", "Кунцевская"));
        STATIONS.put(318, new MetroStation("D1", "Рабочий Посёлок"));
        STATIONS.put(319, new MetroStation("D1", "Сетунь"));
        STATIONS.put(320, new MetroStation("D1", "Немчиновка"));
        STATIONS.put(321, new MetroStation("D1", "Сколково"));
        STATIONS.put(322, new MetroStation("D1", "Баковка"));
        STATIONS.put(323, new MetroStation("D1", "Одинцово"));

        STATIONS.put(324, new MetroStation("D2", "Нахабино"));
        STATIONS.put(325, new MetroStation("D2", "Аникеевка"));
        STATIONS.put(326, new MetroStation("D2", "Опалиха"));
        STATIONS.put(327, new MetroStation("D2", "Красногорская"));
        STATIONS.put(328, new MetroStation("D2", "Павшино"));
        STATIONS.put(329, new MetroStation("D2", "Пенягино"));
        STATIONS.put(330, new MetroStation("D2", "Волоколамская"));
        STATIONS.put(331, new MetroStation("D2", "Трикотажная"));
        STATIONS.put(332, new MetroStation("D2", "Тушинская"));
        STATIONS.put(333, new MetroStation("D2", "Щукинская"));
        STATIONS.put(334, new MetroStation("D2", "Стрешнево"));
        STATIONS.put(335, new MetroStation("D2", "Красный Балтиец"));
        STATIONS.put(336, new MetroStation("D2", "Гражданская"));
        STATIONS.put(337, new MetroStation("D2", "Дмитровская"));
        STATIONS.put(338, new MetroStation("D2", "Марьина Роща"));
        STATIONS.put(339, new MetroStation("D2", "Рижская"));
        STATIONS.put(340, new MetroStation("D2", "Площадь трех вокзалов"));
        STATIONS.put(341, new MetroStation("D2", "Курская"));
        STATIONS.put(342, new MetroStation("D2", "Москва-Товарная"));
        STATIONS.put(343, new MetroStation("D2", "Калитники"));
        STATIONS.put(344, new MetroStation("D2", "Новохохловская"));
        STATIONS.put(345, new MetroStation("D2", "Текстильщики"));
        STATIONS.put(346, new MetroStation("D2", "Печатники"));
        STATIONS.put(347, new MetroStation("D2", "Люблино"));
        STATIONS.put(348, new MetroStation("D2", "Депо"));
        STATIONS.put(349, new MetroStation("D2", "Перерва"));
        STATIONS.put(350, new MetroStation("D2", "Курьяново"));
        STATIONS.put(351, new MetroStation("D2", "Новохохловская"));
        STATIONS.put(352, new MetroStation("D2", "Москворечье"));
        STATIONS.put(353, new MetroStation("D2", "Царицыно"));
        STATIONS.put(354, new MetroStation("D2", "Покровское"));
        STATIONS.put(355, new MetroStation("D2", "Красный Строитель"));
        STATIONS.put(356, new MetroStation("D2", "Битца"));
        STATIONS.put(357, new MetroStation("D2", "Бутово"));
        STATIONS.put(358, new MetroStation("D2", "Щербинка"));
        STATIONS.put(359, new MetroStation("D2", "Остафьево"));
        STATIONS.put(360, new MetroStation("D2", "Силикатная"));
        STATIONS.put(361, new MetroStation("D2", "Подольск"));

        STATIONS.put(362, new MetroStation("D3", "Зеленоград-Крюково"));
        STATIONS.put(363, new MetroStation("D3", "Фирсановская"));
        STATIONS.put(364, new MetroStation("D3", "Сходня"));
        STATIONS.put(365, new MetroStation("D3", "Подрезково"));
        STATIONS.put(366, new MetroStation("D3", "Новоподрезково"));
        STATIONS.put(367, new MetroStation("D3", "Молжаниново"));
        STATIONS.put(368, new MetroStation("D3", "Химки"));
        STATIONS.put(369, new MetroStation("D3", "Левобережная"));
        STATIONS.put(370, new MetroStation("D3", "Ховрино"));
        STATIONS.put(371, new MetroStation("D3", "Грачёвская"));
        STATIONS.put(372, new MetroStation("D3", "Моссельмаш"));
        STATIONS.put(373, new MetroStation("D3", "Лихоборы"));
        STATIONS.put(374, new MetroStation("D3", "Петровско-Разумовская"));
        STATIONS.put(375, new MetroStation("D3", "Останкино"));
        STATIONS.put(376, new MetroStation("D3", "Электрозаводская"));
        STATIONS.put(377, new MetroStation("D3", "Сортировочная"));
        STATIONS.put(378, new MetroStation("D3", "Авиамоторная"));
        STATIONS.put(379, new MetroStation("D3", "Андроновка"));
        STATIONS.put(380, new MetroStation("D3", "Перово"));
        STATIONS.put(381, new MetroStation("D3", "Плющево"));
        STATIONS.put(382, new MetroStation("D3", "Вешняки"));
        STATIONS.put(383, new MetroStation("D3", "Выхино"));
        STATIONS.put(384, new MetroStation("D3", "Косино"));
        STATIONS.put(385, new MetroStation("D3", "Ухтомская"));
        STATIONS.put(386, new MetroStation("D3", "Люберцы"));
        STATIONS.put(387, new MetroStation("D3", "Панки"));
        STATIONS.put(388, new MetroStation("D3", "Томилино"));
        STATIONS.put(389, new MetroStation("D3", "Красково"));
        STATIONS.put(390, new MetroStation("D3", "Малаховка"));
        STATIONS.put(391, new MetroStation("D3", "Удельная"));
        STATIONS.put(392, new MetroStation("D3", "Быково"));
        STATIONS.put(393, new MetroStation("D3", "Ильинская"));
        STATIONS.put(394, new MetroStation("D3", "Отдых"));
        STATIONS.put(395, new MetroStation("D3", "Кратово"));
        STATIONS.put(396, new MetroStation("D3", "Есенинская"));
        STATIONS.put(397, new MetroStation("D3", "Фабричная"));
        STATIONS.put(398, new MetroStation("D3", "Раменское"));
        STATIONS.put(399, new MetroStation("D3", "Ипподром"));

        STATIONS.put(400, new MetroStation("D4", "Апрелевка"));
        STATIONS.put(401, new MetroStation("D4", "Победа"));
        STATIONS.put(402, new MetroStation("D4", "Крёкшино"));
        STATIONS.put(403, new MetroStation("D4", "Санино"));
        STATIONS.put(404, new MetroStation("D4", "Кокошкино"));
        STATIONS.put(405, new MetroStation("D4", "Толстопальцево"));
        STATIONS.put(406, new MetroStation("D4", "Лесной городок"));
        STATIONS.put(407, new MetroStation("D4", "Внуково"));
        STATIONS.put(408, new MetroStation("D4", "Мичуринец"));
        STATIONS.put(409, new MetroStation("D4", "Переделкино"));
        STATIONS.put(410, new MetroStation("D4", "Солнечная"));
        STATIONS.put(411, new MetroStation("D4", "Мещерская"));
        STATIONS.put(412, new MetroStation("D4", "Очаково"));
        STATIONS.put(413, new MetroStation("D4", "Аминьевская"));
        STATIONS.put(414, new MetroStation("D4", "Матвеевская"));
        STATIONS.put(415, new MetroStation("D4", "Минская"));
        STATIONS.put(416, new MetroStation("D4", "Поклонная"));
        STATIONS.put(417, new MetroStation("D4", "Кутузовская"));
        STATIONS.put(418, new MetroStation("D4", "Тестовская"));
        STATIONS.put(419, new MetroStation("D4", "Белорусская"));
        STATIONS.put(420, new MetroStation("D4", "Савёловская"));
        STATIONS.put(421, new MetroStation("D4", "Марьина Роща"));
        STATIONS.put(422, new MetroStation("D4", "Площадь трех вокзалов"));
        STATIONS.put(423, new MetroStation("D4", "Курская"));
        STATIONS.put(424, new MetroStation("D4", "Серп и Молот"));
        STATIONS.put(425, new MetroStation("D4", "Нижегородская"));
        STATIONS.put(426, new MetroStation("D4", "Чухлинка"));
        STATIONS.put(427, new MetroStation("D4", "Кусково"));
        STATIONS.put(428, new MetroStation("D4", "Новогиреево"));
        STATIONS.put(429, new MetroStation("D4", "Реутов"));
        STATIONS.put(430, new MetroStation("D4", "Никольское"));
        STATIONS.put(431, new MetroStation("D4", "Салтыковская"));
        STATIONS.put(432, new MetroStation("D4", "Кучино"));
        STATIONS.put(433, new MetroStation("D4", "Ольгино"));
        STATIONS.put(434, new MetroStation("D4", "Железнодорожная"));

        GRAPH = new MetroGraph();
        // Пересадки Line 6
        GRAPH.addConnection(101, 263); // Для "Ботанический сад" на 6-й и 14-й линиях
        GRAPH.addConnection(104, 227); // Связь между Рижская (6 линия) и Рижская (11 линия)
        GRAPH.addConnection(104, 339); // Связь между Рижская (6 линия) и Рижская (D2)
        GRAPH.addConnection(227, 339); // Связь между Рижская (11 линия) и Рижская (D2)
        GRAPH.addConnection(94, 105); // Связь между Проспект Мира (5 линия) и Проспект Мира (6 линия)
        GRAPH.addConnection(209, 107); // Связь между Сретенский бульвар и Тургеневская
        GRAPH.addConnection(209, 7);   // Связь между Сретенский бульвар и Чистые пруды
        GRAPH.addConnection(107, 7);   // Связь между Тургеневская и Чистые пруды
        GRAPH.addConnection(108, 133); // Связь между Китай-город (6 линия) и Китай-город (7 линия)
        GRAPH.addConnection(109, 151); // Связь между Третьяковская (6 линия) и Третьяковская (8 линия)
        GRAPH.addConnection(109, 38);  // Связь между Третьяковская (6 линия) и Новокузнецкая (2 линия)
        GRAPH.addConnection(151, 38);  // Связь между Третьяковская (8 линия) и Новокузнецкая (2 линия)
        GRAPH.addConnection(110, 88); // Связь между Октябрьская (6 линия) и Октябрьская (5 линия)
        GRAPH.addConnection(112, 279); // Связь между Ленинский проспект (6 линия) и Площадь Гагарина (14 линия)
        GRAPH.addConnection(116, 241); // Связь между Калужская (6 линия) и Воронцовская (11 линия)
        GRAPH.addConnection(121, 260); // Связь между Новоясеневская (6 линия) и Битцевский парк (12 линия)
        // Пересадки Line 7
        GRAPH.addConnection(124, 332); // Связь между Тушинская (7 линия) и Тушинская (D2)
        GRAPH.addConnection(125, 333); // Связь между Щукинская (7 линия) и Щукинская (D2)
        GRAPH.addConnection(126, 285); // Связь между Октябрьское поле (7 линия) и Зорге (14 линия)
        GRAPH.addConnection(126, 286); // Связь между Октябрьское поле (7 линия) и Панфиловская (14 линия)
        GRAPH.addConnection(285, 286); // Связь между Зорге (14 линия) и Панфиловская (14 линия)
        GRAPH.addConnection(127, 284); // Связь между Полежаевская (7 линия) и Хорошево (14 линия)
        GRAPH.addConnection(127, 223); // Связь между Полежаевская (7 линия) и Хорошевская (11 линия)
        GRAPH.addConnection(127, 251); // Связь между Полежаевская (7 линия) и Хорошевская (11А линия)
        GRAPH.addConnection(284, 223); // Связь между Хорошево (14 линия) и Хорошевская (11 линия)
        GRAPH.addConnection(284, 251); // Связь между Хорошево (14 линия) и Хорошевская (11А линия)
        GRAPH.addConnection(223, 251); // Связь между Хорошевская (11 линия) и Хорошевская (11А линия)
        GRAPH.addConnection(131, 36);
        GRAPH.addConnection(131, 182);
        GRAPH.addConnection(36, 182);
        GRAPH.addConnection(132, 8);
        GRAPH.addConnection(108, 133);
        GRAPH.addConnection(134, 91);
        GRAPH.addConnection(134, 150);
        GRAPH.addConnection(91, 150);
        GRAPH.addConnection(135, 212);
        GRAPH.addConnection(136, 273);
        GRAPH.addConnection(137, 345);
        GRAPH.addConnection(137, 233);
        GRAPH.addConnection(345, 233);
        GRAPH.addConnection(139, 382);
        GRAPH.addConnection(140, 383);
        GRAPH.addConnection(141, 235);
        GRAPH.addConnection(141, 384);
        GRAPH.addConnection(235, 384);

        // Связи Line 6
        GRAPH.addConnection(98, 99);
        GRAPH.addConnection(99, 98);
        GRAPH.addConnection(99, 100);
        GRAPH.addConnection(100, 99);
        GRAPH.addConnection(100, 101);
        GRAPH.addConnection(101, 100);
        GRAPH.addConnection(101, 102);
        GRAPH.addConnection(102, 101);
        GRAPH.addConnection(102, 103);
        GRAPH.addConnection(103, 102);
        GRAPH.addConnection(103, 104);
        GRAPH.addConnection(104, 103);
        GRAPH.addConnection(104, 105);
        GRAPH.addConnection(105, 104);
        GRAPH.addConnection(105, 106);
        GRAPH.addConnection(106, 105);
        GRAPH.addConnection(106, 107);
        GRAPH.addConnection(107, 106);
        GRAPH.addConnection(107, 108);
        GRAPH.addConnection(108, 107);
        GRAPH.addConnection(108, 109);
        GRAPH.addConnection(109, 108);
        GRAPH.addConnection(109, 110);
        GRAPH.addConnection(110, 109);
        GRAPH.addConnection(110, 111);
        GRAPH.addConnection(111, 110);
        GRAPH.addConnection(111, 112);
        GRAPH.addConnection(112, 111);
        GRAPH.addConnection(112, 113);
        GRAPH.addConnection(113, 112);
        GRAPH.addConnection(113, 114);
        GRAPH.addConnection(114, 113);
        GRAPH.addConnection(114, 115);
        GRAPH.addConnection(115, 114);
        GRAPH.addConnection(115, 116);
        GRAPH.addConnection(116, 115);
        GRAPH.addConnection(116, 117);
        GRAPH.addConnection(117, 116);
        GRAPH.addConnection(117, 118);
        GRAPH.addConnection(118, 117);
        GRAPH.addConnection(118, 119);
        GRAPH.addConnection(119, 118);
        GRAPH.addConnection(119, 120);
        GRAPH.addConnection(120, 119);
        GRAPH.addConnection(120, 121);
        GRAPH.addConnection(121, 120);

        // Связи Line 7
        GRAPH.addConnection(122, 123);
        GRAPH.addConnection(123, 122);
        GRAPH.addConnection(123, 124);
        GRAPH.addConnection(124, 123);
        GRAPH.addConnection(124, 125);
        GRAPH.addConnection(125, 124);
        GRAPH.addConnection(125, 126);
        GRAPH.addConnection(126, 125);
        GRAPH.addConnection(126, 127);
        GRAPH.addConnection(127, 126);
        GRAPH.addConnection(127, 128);
        GRAPH.addConnection(128, 127);
        GRAPH.addConnection(128, 129);
        GRAPH.addConnection(129, 128);
        GRAPH.addConnection(129, 130);
        GRAPH.addConnection(130, 129);
        GRAPH.addConnection(130, 131);
        GRAPH.addConnection(131, 130);
        GRAPH.addConnection(131, 132);
        GRAPH.addConnection(132, 131);
        GRAPH.addConnection(132, 133);
        GRAPH.addConnection(133, 132);
        GRAPH.addConnection(133, 134);
        GRAPH.addConnection(134, 133);
        GRAPH.addConnection(134, 135);
        GRAPH.addConnection(135, 134);
        GRAPH.addConnection(135, 136);
        GRAPH.addConnection(136, 135);
        GRAPH.addConnection(136, 137);
        GRAPH.addConnection(137, 136);
        GRAPH.addConnection(137, 138);
        GRAPH.addConnection(138, 137);
        GRAPH.addConnection(138, 139);
        GRAPH.addConnection(139, 138);
        GRAPH.addConnection(139, 140);
        GRAPH.addConnection(140, 139);
        GRAPH.addConnection(140, 141);
        GRAPH.addConnection(141, 140);
        GRAPH.addConnection(141, 142);
        GRAPH.addConnection(142, 141);
        GRAPH.addConnection(142, 143);
        GRAPH.addConnection(143, 142);

        // Пересадки D1
        GRAPH.addConnection(306, 198);
        GRAPH.addConnection(309, 261);
        GRAPH.addConnection(309, 202);
        GRAPH.addConnection(261, 202);
        GRAPH.addConnection(310, 177);
        GRAPH.addConnection(311, 420);
        GRAPH.addConnection(311, 225);
        GRAPH.addConnection(311, 179);
        GRAPH.addConnection(420, 225);
        GRAPH.addConnection(420, 179);
        GRAPH.addConnection(225, 179);
        GRAPH.addConnection(312, 419);
        GRAPH.addConnection(312, 96);
        GRAPH.addConnection(312, 34);
        GRAPH.addConnection(419, 96);
        GRAPH.addConnection(419, 34);
        GRAPH.addConnection(96, 34);
        GRAPH.addConnection(313, 128);
        GRAPH.addConnection(314, 283);
        GRAPH.addConnection(314, 253);
        GRAPH.addConnection(283, 253);
        GRAPH.addConnection(315, 76);
        GRAPH.addConnection(316, 63);
        GRAPH.addConnection(317, 247);
        GRAPH.addConnection(317, 64);
        GRAPH.addConnection(317, 73);
        GRAPH.addConnection(247, 64);
        GRAPH.addConnection(247, 73);
        GRAPH.addConnection(64, 73);

        // Связи D1
        GRAPH.addConnection(299, 300);
        GRAPH.addConnection(300, 299);
        GRAPH.addConnection(300, 301);
        GRAPH.addConnection(301, 300);
        GRAPH.addConnection(301, 302);
        GRAPH.addConnection(302, 301);
        GRAPH.addConnection(302, 303);
        GRAPH.addConnection(303, 302);
        GRAPH.addConnection(303, 304);
        GRAPH.addConnection(304, 303);
        GRAPH.addConnection(304, 305);
        GRAPH.addConnection(305, 304);
        GRAPH.addConnection(305, 306);
        GRAPH.addConnection(306, 305);
        GRAPH.addConnection(306, 307);
        GRAPH.addConnection(307, 306);
        GRAPH.addConnection(307, 308);
        GRAPH.addConnection(308, 307);
        GRAPH.addConnection(308, 309);
        GRAPH.addConnection(309, 308);
        GRAPH.addConnection(309, 310);
        GRAPH.addConnection(310, 309);
        GRAPH.addConnection(310, 311);
        GRAPH.addConnection(311, 310);
        GRAPH.addConnection(311, 312);
        GRAPH.addConnection(312, 311);
        GRAPH.addConnection(312, 313);
        GRAPH.addConnection(313, 312);
        GRAPH.addConnection(313, 314);
        GRAPH.addConnection(314, 313);
        GRAPH.addConnection(314, 315);
        GRAPH.addConnection(315, 314);
        GRAPH.addConnection(315, 316);
        GRAPH.addConnection(316, 315);
        GRAPH.addConnection(316, 317);
        GRAPH.addConnection(317, 316);
        GRAPH.addConnection(317, 318);
        GRAPH.addConnection(318, 317);
        GRAPH.addConnection(318, 319);
        GRAPH.addConnection(319, 318);
        GRAPH.addConnection(319, 320);
        GRAPH.addConnection(320, 319);
        GRAPH.addConnection(320, 321);
        GRAPH.addConnection(321, 320);
        GRAPH.addConnection(321, 322);
        GRAPH.addConnection(322, 321);
        GRAPH.addConnection(322, 323);
        GRAPH.addConnection(323, 322);

    }

}
