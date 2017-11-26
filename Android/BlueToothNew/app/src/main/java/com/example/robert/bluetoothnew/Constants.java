/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.robert.bluetoothnew;

import com.google.android.gms.maps.model.LatLng;

/**
 * Defines several constants used between {@link BluetoothChatService} and the UI.
 */
public interface Constants {

    // Message types sent from the BluetoothChatService Handler
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;

    // Key names received from the BluetoothChatService Handler
    public static final String DEVICE_NAME = "device_name";
    public static final String TOAST = "toast";
    public static final LatLng[] SPECIAL1 = {new LatLng(24.18069, 120.64671),new LatLng(24.18069, 120.64671),new LatLng(24.18072, 120.64718), new LatLng(24.18066, 120.64728),new LatLng(24.17993, 120.64657)};        //育樂館
    public static final LatLng[] SPECIAL2 = {new LatLng(24.17991, 120.64674) ,new LatLng(24.17986, 120.64657),new LatLng(24.17992, 120.64725),new LatLng(24.17987, 120.64732),new LatLng(24.17967, 120.64733),new LatLng(24.17958, 120.64728)};    //語言大樓
    public static final LatLng[] SPECIAL3 = {new LatLng(24.17953, 120.64733), new LatLng(24.17904, 120.64734), new LatLng(24.17897, 120.64729),new LatLng(24.17893, 120.64671),new LatLng(24.17896, 120.64663),new LatLng(24.1794, 120.6466)};     //忠勤樓
    public static final LatLng[] SPECIAL4 = {new LatLng(24.17872, 120.64669),new LatLng(24.17872, 120.64705),new LatLng(24.17873, 120.64729)};     //行政一館
    public static final LatLng[] SPECIAL5 = {new LatLng(24.17873, 120.64745), new LatLng(24.17874, 120.64789)};   //行政二館
    public static final LatLng[] SPECIAL6 = {new LatLng(24.1789, 120.6484),new LatLng(24.179, 120.64863),new LatLng(24.179, 120.64897),new LatLng(24.17895, 120.6493),new LatLng(24.17846, 120.64929)};       //圖書館
    public static final LatLng[] SPECIAL7 = {new LatLng(24.17839, 120.64925)};   //科航管
    public static final LatLng[] SPECIAL8 = {new LatLng(24.17848, 120.64943),new LatLng(24.17851, 120.65007)};   //商學院
    public static final LatLng[] SPECIAL9 = {new LatLng(24.17901, 120.65008),new LatLng(24.17912, 120.65013),new LatLng(24.17955, 120.65012),new LatLng(24.17957, 120.65002),new LatLng(24.17956, 120.64904),new LatLng(24.17907, 120.64901),new LatLng(24.179, 120.64905)};   //資電館
    public static final LatLng[] SPECIAL10 = {new LatLng(24.17971, 120.65006),new LatLng(24.17978, 120.65013),new LatLng(24.17968, 120.64907), new LatLng(24.17995, 120.64911)};   //人社院
    public static final LatLng[] SPECIAL11 = {new LatLng(24.17971, 120.649),new LatLng(24.17993, 120.64893),new LatLng(24.17994, 120.64832),new LatLng(24.17991, 120.64827), new LatLng(24.17967, 120.64828)};   //人言
    public static final LatLng[] SPECIAL12 = {new LatLng(24.17954, 120.64828),new LatLng(24.17961, 120.64818),new LatLng(24.17905, 120.6483),new LatLng(24.179, 120.64825),new LatLng(24.17898, 120.64744),new LatLng(24.17904, 120.64734),new LatLng(24.17953, 120.64733),new LatLng(24.17962, 120.64741)};   //工學院
    public static final LatLng[] SPECIAL13 = {new LatLng(24.17962, 120.64751)};     //第一招待所
    public static final LatLng[] SPECIAL14 = {new LatLng(24.18076, 120.6478),new LatLng(24.18075, 120.64739),new LatLng(24.18129, 120.64725),new LatLng(24.18132, 120.64732)};     //理學院


    public static final LatLng[] position = {new LatLng(24.1812269,120.646596)
            , new LatLng(24.1818978,120.6482141)
            , new LatLng(24.181567,120.647048)
            , new LatLng(24.1813361,120.647072)
            , new LatLng(24.1812436,120.6469701)
            , new LatLng(24.1813155,120.647261)
            , new LatLng(24.1810846,120.6473503)
            , new LatLng(24.1813968,120.6481862)
            , new LatLng(24.1813318,120.6474817)
            , new LatLng(24.1807424,120.6472668)
            , new LatLng(24.1807776,120.6466144)
            , new LatLng(24.1807624,120.6475805)
            , new LatLng(24.180771,120.6482067)
            , new LatLng(24.1803133,120.646554)
            , new LatLng(24.180319,120.6472995)
            , new LatLng(24.1802763,120.6482634)
            , new LatLng(24.1799308,120.6465794)
            , new LatLng(24.1799144,120.6469079)
            , new LatLng(24.179918,120.6472)
            , new LatLng(24.179908,120.64733)
            , new LatLng(24.1799522,120.6483259)
            , new LatLng(24.1796074,120.6465938)
            , new LatLng(24.1795662,120.6469118)
            , new LatLng(24.1795897,120.6473301)
            , new LatLng(24.179619,120.64829)
            , new LatLng(24.179141,120.646629)
            , new LatLng(24.1792595,120.6473453)
            , new LatLng(24.179175,120.648299)
            , new LatLng(24.1789671,120.6466385)
            , new LatLng(24.1789502,120.6469585)
            , new LatLng(24.178984,120.647359)
            , new LatLng(24.179007,120.648306)
            , new LatLng(24.178724,120.646699)
            , new LatLng(24.178725,120.646982)
            , new LatLng(24.178731,120.647365)
            , new LatLng(24.178739,120.647659)
            , new LatLng(24.1787475,120.6478954)
            , new LatLng(24.1789881,120.647884)
            , new LatLng(24.178994,120.648095)
            , new LatLng(24.178928,120.648388)
            , new LatLng(24.1788706,120.6484245)
            , new LatLng(24.1786666,120.6481162)
            , new LatLng(24.1787105,120.6484205)
            , new LatLng(24.178729,120.648572)
            , new LatLng(24.17844,120.646686)
            , new LatLng(24.1787332,120.6474591)
            , new LatLng(24.178488,120.647893)
            , new LatLng(24.178494,120.648224)
            , new LatLng(24.178505,120.648561)
            , new LatLng(24.178193,120.646736)
            , new LatLng(24.178211,120.647368)
            , new LatLng(24.178235,120.647864)
            , new LatLng(24.178347,120.648628)
            , new LatLng(24.18145,120.649031)
            , new LatLng(24.1811153,120.6482303)
            , new LatLng(24.1802821,120.6482623)
            , new LatLng(24.180345,120.6492306)
            , new LatLng(24.1799798,120.64988)
            , new LatLng(24.179937,120.648934)
            , new LatLng(24.1799696,120.6496159)
            , new LatLng(24.1798609,120.6501251)
            , new LatLng(24.1795488,120.648289)
            , new LatLng(24.1796899,120.6490096)
            , new LatLng(24.1796935,120.6492529)
            , new LatLng(24.1796479,120.6501223)
            , new LatLng(24.1794326,120.6482947)
            , new LatLng(24.1794378,120.6490076)
            , new LatLng(24.1795592,120.6490927)
            , new LatLng(24.1795645,120.649478)
            , new LatLng(24.1795699,120.6501236)
            , new LatLng(24.1790039,120.64867)
            , new LatLng(24.17901,120.649017)
            , new LatLng(24.179005,120.649305)
            , new LatLng(24.179008,120.649559)
            , new LatLng(24.179008,120.650106)
            , new LatLng(24.178789,120.649307)
            , new LatLng(24.1785364,120.6498626)
            , new LatLng(24.1785287,120.6501334)
            , new LatLng(24.1787367,120.6501231)
            , new LatLng(24.178585,120.649305)
            , new LatLng(24.178461,120.649313)
            , new LatLng(24.178539,120.6496)
            , new LatLng(24.1785377,120.649795)
            , new LatLng(24.1815562,120.6469327)
            , new LatLng(24.179562,120.6490103)
            , new LatLng(24.179559,120.6490197)
            , new LatLng(24.1796397,120.6490083)
            , new LatLng(24.1793467,120.649015)
            , new LatLng(24.1792635,120.6490177)
            , new LatLng(24.1791944,120.649015)
            , new LatLng(24.1791412,120.6490197)
            , new LatLng(24.1790794,120.6490184)
            , new LatLng(24.1790084,120.6488427)
            , new LatLng(24.1790041,120.6487314)
            , new LatLng(24.179009,120.6491257)
            , new LatLng(24.1790078,120.6492142)
            , new LatLng(24.1790109,120.6494126)
            , new LatLng(24.179009,120.6494623)
            , new LatLng(24.1790164,120.6496447)
            , new LatLng(24.1790164,120.6497392)
            , new LatLng(24.1790115,120.6498344)
            , new LatLng(24.1790188,120.6499585)
            , new LatLng(24.1790255,120.6501342)
            , new LatLng(24.1790096,120.6501248)
            , new LatLng(24.1790188,120.6501462)
            , new LatLng(24.1791265,120.6501395)
            , new LatLng(24.1791932,120.6501503)
            , new LatLng(24.179258,120.6501429)
            , new LatLng(24.1793192,120.6501449)
            , new LatLng(24.1793586,120.6501368)
            , new LatLng(24.1794057,120.6501355)
            , new LatLng(24.1794486,120.6501328)
            , new LatLng(24.1794929,120.6501298)
            , new LatLng(24.1795691,120.6501191)
            , new LatLng(24.1795525,120.6501234)
            , new LatLng(24.1795758,120.6501295)
            , new LatLng(24.1795712,120.6500299)
            , new LatLng(24.1795697,120.6499384)
            , new LatLng(24.1795697,120.6498519)
            , new LatLng(24.1795681,120.6497875)
            , new LatLng(24.1795691,120.6497228)
            , new LatLng(24.1795669,120.6496718)
            , new LatLng(24.1795678,120.6496101)
            , new LatLng(24.179566,120.6495471)
            , new LatLng(24.1795663,120.6493798)
            , new LatLng(24.1795663,120.6492886)
            , new LatLng(24.1795651,120.6491887)
            , new LatLng(24.1796874,120.6490982)
            , new LatLng(24.1796899,120.6491733)
            , new LatLng(24.1796948,120.6493389)
            , new LatLng(24.1797009,120.6494039)
            , new LatLng(24.1796997,120.6494683)
            , new LatLng(24.1796819,120.6490143)
            , new LatLng(24.1797021,120.6495266)
            , new LatLng(24.1797033,120.6495823)
            , new LatLng(24.1797052,120.6496386)
            , new LatLng(24.1797082,120.6496963)
            , new LatLng(24.1797101,120.649762)
            , new LatLng(24.179715,120.6498284)
            , new LatLng(24.1797137,120.6498901)
            , new LatLng(24.1797168,120.6499558)
            , new LatLng(24.179718,120.6500088)
            , new LatLng(24.1797198,120.6500617)
            , new LatLng(24.1797241,120.6501315)
            , new LatLng(24.1797205,120.6501241)
            , new LatLng(24.1797859,120.6501301)
            , new LatLng(24.1799217,120.6501248)
            , new LatLng(24.1799529,120.6501073)
            , new LatLng(24.1799566,120.6500933)
            , new LatLng(24.1799798,120.6500785)
            , new LatLng(24.179967,120.6500691)
            , new LatLng(24.1799664,120.6500503)
            , new LatLng(24.1799737,120.6500322)
            , new LatLng(24.1799786,120.6500101)
            , new LatLng(24.1799823,120.649931)
            , new LatLng(24.1799777,120.6498039)
            , new LatLng(24.1799747,120.6497148)
            , new LatLng(24.1799566,120.6494804)
            , new LatLng(24.1799481,120.649359)
            , new LatLng(24.1799413,120.6492383)
            , new LatLng(24.1799407,120.6491163)
            , new LatLng(24.1799474,120.6490003)
            , new LatLng(24.179929,120.6490097)
            , new LatLng(24.1799327,120.6489862)
            , new LatLng(24.1798697,120.6490029)
            , new LatLng(24.1798141,120.6490016)
            , new LatLng(24.1797627,120.6490043)
            , new LatLng(24.179948,120.6487884)
            , new LatLng(24.1799517,120.6486355)
            , new LatLng(24.179956,120.6485141)
            , new LatLng(24.1799541,120.6484075)
            , new LatLng(24.1799508,120.6482073)
            , new LatLng(24.1799464,120.6481547)
            , new LatLng(24.1799456,120.6481027)
            , new LatLng(24.1799431,120.6480464)
            , new LatLng(24.1799416,120.6480008)
            , new LatLng(24.1799404,120.6479529)
            , new LatLng(24.1799379,120.6478992)
            , new LatLng(24.1799377,120.6478509)
            , new LatLng(24.1799364,120.647803)
            , new LatLng(24.179933,120.6477396)
            , new LatLng(24.1799322,120.6476984)
            , new LatLng(24.1799367,120.6476632)
            , new LatLng(24.179934,120.6476575)
            , new LatLng(24.1799321,120.6476672)
            , new LatLng(24.1799893,120.6476615)
            , new LatLng(24.1800407,120.6476558)
            , new LatLng(24.1789992,120.648323)
            , new LatLng(24.1793259,120.6482962)
            , new LatLng(24.1790035,120.6481875)
            , new LatLng(24.178998,120.647979)
            , new LatLng(24.178991,120.6477913)
            , new LatLng(24.1789888,120.6476947)
            , new LatLng(24.1789839,120.6475636)
            , new LatLng(24.1789833,120.6474479)
            , new LatLng(24.1789784,120.6473661)
            , new LatLng(24.1789772,120.6473413)
            , new LatLng(24.1791026,120.647348)
            , new LatLng(24.1791919,120.6473433)
            , new LatLng(24.1796195,120.6481849)
            , new LatLng(24.1796195,120.6480819)
            , new LatLng(24.1796186,120.6479917)
            , new LatLng(24.1796186,120.64786)
            , new LatLng(24.179618,120.6477939)
            , new LatLng(24.1796198,120.6477299)
            , new LatLng(24.1795828,120.647053)
            , new LatLng(24.1795724,120.6469792)
            , new LatLng(24.1797388,120.6473302)
            , new LatLng(24.1798385,120.6473279)
            , new LatLng(24.179918,120.6473105)
            , new LatLng(24.1799144,120.6470436)
            , new LatLng(24.1799107,120.6467445)
            , new LatLng(24.1799119,120.6465769)
            , new LatLng(24.179918,120.6465568)
            , new LatLng(24.1800746,120.6465608)
            , new LatLng(24.1802398,120.6465501)
            , new LatLng(24.1804613,120.6465447)
            , new LatLng(24.180613,120.6465366)
            , new LatLng(24.1806668,120.6465447)
            , new LatLng(24.1806766,120.6465702)
            , new LatLng(24.1806949,120.646597)
            , new LatLng(24.1806998,120.6467137)
            , new LatLng(24.1807047,120.6468317)
            , new LatLng(24.1807133,120.646947)
            , new LatLng(24.1807194,120.6470744)
            , new LatLng(24.1807295,120.6471814)
            , new LatLng(24.1807292,120.647285)
            , new LatLng(24.1809054,120.6465876)
            , new LatLng(24.1810106,120.6465849)
            , new LatLng(24.1811195,120.6465836)
            , new LatLng(24.1812178,120.6465887)
            , new LatLng(24.1812314,120.6467264)
            , new LatLng(24.1812308,120.6468277)
            , new LatLng(24.1812357,120.6469142)
            , new LatLng(24.181265,120.6470221)
            , new LatLng(24.1812822,120.6470831)
            , new LatLng(24.1812938,120.6471442)
            , new LatLng(24.1813079,120.6472149)
            , new LatLng(24.1813189,120.6472605)
            , new LatLng(24.1813225,120.6473296)
            , new LatLng(24.1813259,120.6473772)
            , new LatLng(24.1813293,120.6474355)
            , new LatLng(24.1813342,120.6475193)
            , new LatLng(24.181336,120.6475656)
            , new LatLng(24.1813394,120.6476119)
            , new LatLng(24.1813418,120.6476545)
            , new LatLng(24.181344,120.6477021)
            , new LatLng(24.1813461,120.6477463)
            , new LatLng(24.1813479,120.6477849)
            , new LatLng(24.1813504,120.6478301)
            , new LatLng(24.1813537,120.6478771)
            , new LatLng(24.1813562,120.6479351)
            , new LatLng(24.1813611,120.6479803)
            , new LatLng(24.1813648,120.6480276)
            , new LatLng(24.1813709,120.6480725)
            , new LatLng(24.1813804,120.6481228)
            , new LatLng(24.1813929,120.6481647)
            , new LatLng(24.1814027,120.6481882)
            , new LatLng(24.181399,120.6481943)
            , new LatLng(24.1814428,120.6481741)
            , new LatLng(24.1814764,120.6481577)
            , new LatLng(24.1815134,120.6481503)
            , new LatLng(24.1815492,120.6481503)
            , new LatLng(24.1815015,120.6481547)
            , new LatLng(24.1815893,120.6481597)
            , new LatLng(24.1816324,120.6481704)
            , new LatLng(24.1816743,120.6481832)
            , new LatLng(24.1817162,120.6481979)
            , new LatLng(24.1817495,120.6482016)
            , new LatLng(24.1818015,120.6482053)
            , new LatLng(24.1818563,120.6482087)
            , new LatLng(24.181934,120.6482103)
            , new LatLng(24.1819575,120.6482103)
            , new LatLng(24.181347,120.6482077)
            , new LatLng(24.1813054,120.6482157)
            , new LatLng(24.1812589,120.6482291)
            , new LatLng(24.1812173,120.6482291)
            , new LatLng(24.181166,120.6482264)
            , new LatLng(24.1810705,120.6482372)
            , new LatLng(24.1810338,120.6482372)
            , new LatLng(24.1810045,120.6482345)
            , new LatLng(24.1809653,120.6482372)
            , new LatLng(24.1809286,120.6482425)
            , new LatLng(24.1808898,120.6482419)
            , new LatLng(24.1808439,120.6482412)
            , new LatLng(24.1808023,120.6482415)
            , new LatLng(24.1807711,120.6482479)
            , new LatLng(24.180765,120.6482378)
            , new LatLng(24.180769,120.6480651)
            , new LatLng(24.1807656,120.6478549)
            , new LatLng(24.1807647,120.6476326)
            , new LatLng(24.1807543,120.6474922)
            , new LatLng(24.18075,120.6473923)
            , new LatLng(24.1807524,120.6476122)
            , new LatLng(24.1806815,120.6476176)
            , new LatLng(24.180613,120.6476256)
            , new LatLng(24.1805665,120.6476229)
            , new LatLng(24.1805224,120.6476283)
            , new LatLng(24.1804686,120.6476364)
            , new LatLng(24.180427,120.6476337)
            , new LatLng(24.1803805,120.647639)
            , new LatLng(24.1803292,120.6476407)
            , new LatLng(24.18029,120.6476444)
            , new LatLng(24.1802499,120.6476491)
            , new LatLng(24.1802264,120.6476471)
            , new LatLng(24.1801936,120.6476498)
            , new LatLng(24.1801652,120.6476551)
            , new LatLng(24.1801383,120.6476578)
            , new LatLng(24.1806668,120.6472823)
            , new LatLng(24.180613,120.6472877)
            , new LatLng(24.1805591,120.6472877)
            , new LatLng(24.1805273,120.647293)
            , new LatLng(24.1804912,120.647291)
            , new LatLng(24.1804484,120.6472924)
            , new LatLng(24.1804099,120.6472964)
            , new LatLng(24.1803628,120.6472977)
            , new LatLng(24.1802673,120.6473031)
            , new LatLng(24.1807368,120.6472736)
            , new LatLng(24.1802368,120.6473058)
            , new LatLng(24.1802016,120.6473078)
            , new LatLng(24.1801741,120.6473115)
            , new LatLng(24.180145,120.6473125)
            , new LatLng(24.1801135,120.6473145)
            , new LatLng(24.1800857,120.6473162)
            , new LatLng(24.1800459,120.6473205)
            , new LatLng(24.1800104,120.6473212)
            , new LatLng(24.1799777,120.6473242)
            , new LatLng(24.1799505,120.6473252)
            , new LatLng(24.1799281,120.6473306)
            , new LatLng(24.1799232,120.6473252)
            , new LatLng(24.1799217,120.6472535)
            , new LatLng(24.1799226,120.6473802)
            , new LatLng(24.1799263,120.6474295)
            , new LatLng(24.1799275,120.6474848)
            , new LatLng(24.1799288,120.6475311)
            , new LatLng(24.1799318,120.6475857)
            , new LatLng(24.1798746,120.6473286)
            , new LatLng(24.1798082,120.6473299)
            , new LatLng(24.1797755,120.6473299)
            , new LatLng(24.1797104,120.6473313)
            , new LatLng(24.1796764,120.6473323)
            , new LatLng(24.1807757,120.6482409)
            , new LatLng(24.1807209,120.6482429)
            , new LatLng(24.1806741,120.6482409)
            , new LatLng(24.1806325,120.6482425)
            , new LatLng(24.1805793,120.6482435)
            , new LatLng(24.1805334,120.6482442)
            , new LatLng(24.1804909,120.6482462)
            , new LatLng(24.1804444,120.6482479)
            , new LatLng(24.1803924,120.6482513)
            , new LatLng(24.1803502,120.6482536)
            , new LatLng(24.1803105,120.6482563)
            , new LatLng(24.1802398,120.6482596)
            , new LatLng(24.1802052,120.648261)
            , new LatLng(24.1801566,120.6482654)
            , new LatLng(24.1801233,120.6482687)
            , new LatLng(24.1800927,120.6482667)
            , new LatLng(24.1800551,120.648269)
            , new LatLng(24.1800162,120.6482711)
            , new LatLng(24.1787191,120.6466547)
            , new LatLng(24.1787117,120.6466466)
            , new LatLng(24.1787221,120.6467834)
            , new LatLng(24.1787252,120.6468786)
            , new LatLng(24.1787937,120.6466473)
            , new LatLng(24.1788751,120.646648)
            , new LatLng(24.1789277,120.6466547)
            , new LatLng(24.1789191,120.6466419)
            , new LatLng(24.1789313,120.6466345)
            , new LatLng(24.1789338,120.6467143)
            , new LatLng(24.1789411,120.6467988)
            , new LatLng(24.1789479,120.6468853)
            , new LatLng(24.1789543,120.6470453)
            , new LatLng(24.1789586,120.6470526)
            , new LatLng(24.1789549,120.6470503)
            , new LatLng(24.1789096,120.647049)
            , new LatLng(24.178872,120.64705)
            , new LatLng(24.178838,120.6470503)
            , new LatLng(24.1788007,120.6470506)
            , new LatLng(24.178761,120.647049)
            , new LatLng(24.1787316,120.6470466)
            , new LatLng(24.1787338,120.6470533)
            , new LatLng(24.1787276,120.647051)
            , new LatLng(24.1787301,120.6471002)
            , new LatLng(24.1787301,120.6471703)
            , new LatLng(24.1787298,120.647227)
            , new LatLng(24.1787334,120.6472903)
            , new LatLng(24.1787873,120.6473621)
            , new LatLng(24.1788396,120.6473614)
            , new LatLng(24.1788928,120.6473574)
            , new LatLng(24.17895,120.6473524)
            , new LatLng(24.1789778,120.6473537)
            , new LatLng(24.1789622,120.6471093)
            , new LatLng(24.1789659,120.647173)
            , new LatLng(24.1789705,120.647238)
            , new LatLng(24.1789751,120.6472964)
            , new LatLng(24.1787365,120.6474074)
            , new LatLng(24.1787331,120.647403)
            , new LatLng(24.1787307,120.6474104)
            , new LatLng(24.1787399,120.6475331)
            , new LatLng(24.1787393,120.6475975)
            , new LatLng(24.1787448,120.6477376)
            , new LatLng(24.1787497,120.6478221)
            , new LatLng(24.1787374,120.6479535)
            , new LatLng(24.1787234,120.6480045)
            , new LatLng(24.1787056,120.6480521)
            , new LatLng(24.1786414,120.6481782)
            , new LatLng(24.1786328,120.6482385)
            , new LatLng(24.1786334,120.6483103)
            , new LatLng(24.1786438,120.6483686)
            , new LatLng(24.178686,120.6484095)
            , new LatLng(24.1787796,120.6484276)
            , new LatLng(24.1788463,120.6484269)
            , new LatLng(24.178905,120.6484075)
            , new LatLng(24.1789748,120.6483404)
            , new LatLng(24.1790127,120.6482942)
            , new LatLng(24.1790078,120.6484276)
            , new LatLng(24.1790066,120.6485282)
            , new LatLng(24.1787154,120.6493047)
            , new LatLng(24.1784493,120.6493121)
            , new LatLng(24.1784652,120.6492993)
            , new LatLng(24.178442,120.6493255)
            , new LatLng(24.1784505,120.6493496)
            , new LatLng(24.1784517,120.6493677)
            , new LatLng(24.1784652,120.6493972)
            , new LatLng(24.1784854,120.6494321)
            , new LatLng(24.178494,120.6494804)
            , new LatLng(24.1785166,120.6495441)
            , new LatLng(24.1786567,120.649306)
            , new LatLng(24.1785429,120.6493087)
            , new LatLng(24.1785417,120.6496708)
            , new LatLng(24.1785429,120.6497365)
            , new LatLng(24.1785319,120.6499115)
            , new LatLng(24.1785215,120.6499545)
            , new LatLng(24.178508,120.6500155)
            , new LatLng(24.1785105,120.6500718)
            , new LatLng(24.1785423,120.6501489)
            , new LatLng(24.1785863,120.6501281)
            , new LatLng(24.1786616,120.6501268)
            , new LatLng(24.1788237,120.6501228)
            , new LatLng(24.1789081,120.6501295)
            , new LatLng(24.1789876,120.6501342)
            , new LatLng(24.1788775,120.6493074)
            , new LatLng(24.1789705,120.649302)
            , new LatLng(24.1790035,120.649296)
            , new LatLng(24.1790005,120.6493154)
            , new LatLng(24.1794287,120.6473386)
            , new LatLng(24.179277,120.6466158)
            , new LatLng(24.1794005,120.646603)
            , new LatLng(24.1795076,120.646597)
            , new LatLng(24.1796917,120.6465836)
            , new LatLng(24.179778,120.6465802)
            , new LatLng(24.1798679,120.6465729)
            , new LatLng(24.1790549,120.6466292)
            , new LatLng(24.1799548,120.6482707)
            , new LatLng(24.1799471,120.6482767)
            , new LatLng(24.1799009,120.6482787)
            , new LatLng(24.1798532,120.6482801)
            , new LatLng(24.1798128,120.6482801)
            , new LatLng(24.1797896,120.6482814)
            , new LatLng(24.1797676,120.6482894)
            , new LatLng(24.1797467,120.6482928)
            , new LatLng(24.1797247,120.6482841)
            , new LatLng(24.1797027,120.6482854)
            , new LatLng(24.1796783,120.6482881)
            , new LatLng(24.179622,120.6476256)
            , new LatLng(24.1796281,120.6473467)
            , new LatLng(24.1796208,120.6475157)
            , new LatLng(24.1796232,120.6474137)
            , new LatLng(24.1795877,120.647285)
            , new LatLng(24.1795302,120.6473359)
            , new LatLng(24.1793699,120.6473453)
            , new LatLng(24.1795902,120.6471844)
            , new LatLng(24.1799254,120.64712)
            , new LatLng(24.1809008,120.6492286)
            , new LatLng(24.1799599,120.6482774)
            , new LatLng(24.1799517,120.6482714)
            , new LatLng(24.1799517,120.6482657)
            , new LatLng(24.179956,120.6482818)
            , new LatLng(24.1799327,120.6476622)
            , new LatLng(24.1799309,120.6476588)
            , new LatLng(24.1799312,120.6476649)
            , new LatLng(24.1807638,120.6476069)
            , new LatLng(24.1807625,120.6476165)
            , new LatLng(24.1807622,120.6476102)
            , new LatLng(24.1796214,120.6482854)
            , new LatLng(24.1796152,120.6482868)
            , new LatLng(24.1796177,120.6482801)
            , new LatLng(24.1796116,120.6482814)
            , new LatLng(24.1796104,120.6482928)
            , new LatLng(24.1796048,120.6482848)
            , new LatLng(24.1797302,120.6490056)
            , new LatLng(24.1797988,120.6490076)
            , new LatLng(24.1795626,120.649135)
            , new LatLng(24.1795632,120.6492142)
            , new LatLng(24.1795645,120.6492504)
            , new LatLng(24.179006,120.6486301)
            , new LatLng(24.1790023,120.648616)
            , new LatLng(24.1790029,120.6485879)
            , new LatLng(24.1790072,120.6484947)
            , new LatLng(24.1790084,120.6484625)
            , new LatLng(24.179009,120.6483961)
            , new LatLng(24.1790109,120.6483693)
            , new LatLng(24.1790072,120.6483445)
            , new LatLng(24.1788891,120.6484182)
            , new LatLng(24.1789613,120.6483612)
            , new LatLng(24.1796183,120.6473467)
            , new LatLng(24.1796104,120.6473473)
            , new LatLng(24.1795822,120.6473239)
            , new LatLng(24.179581,120.6473413)
            , new LatLng(24.1796079,120.6473359)
            , new LatLng(24.1795761,120.6473326)
            , new LatLng(24.1796324,120.6473252)
            , new LatLng(24.1796318,120.6473306)
            , new LatLng(24.1789757,120.64735)
            , new LatLng(24.1787827,120.6479689)
            , new LatLng(24.1787723,120.6479552)
            , new LatLng(24.1787662,120.6479495)
            , new LatLng(24.1787802,120.6479626)
            , new LatLng(24.1787937,120.6479746)
            , new LatLng(24.1788044,120.647981)
            , new LatLng(24.178816,120.647986)
            , new LatLng(24.1788267,120.6479901)
            , new LatLng(24.1788384,120.6479931)
            , new LatLng(24.1788518,120.6479961)
            , new LatLng(24.178865,120.6479968)
            , new LatLng(24.1788497,120.6479938)
            , new LatLng(24.1788778,120.6479971)
            , new LatLng(24.1788894,120.6479961)
            , new LatLng(24.1789008,120.6479971)
            , new LatLng(24.178913,120.6479971)
            , new LatLng(24.1788894,120.6479961)
            , new LatLng(24.1789243,120.6479974)
            , new LatLng(24.178935,120.6479971)
            , new LatLng(24.178946,120.6479964)
            , new LatLng(24.1789567,120.6479958)
            , new LatLng(24.178968,120.6479958)
            , new LatLng(24.1789787,120.6479958)
            , new LatLng(24.1789901,120.6479951)
            , new LatLng(24.1789959,120.6479227)
            , new LatLng(24.1789919,120.6479435)
            , new LatLng(24.1789925,120.6478395)
            , new LatLng(24.1789895,120.6477423)
            , new LatLng(24.1789867,120.6476494)
            , new LatLng(24.1789852,120.6476032)
            , new LatLng(24.1798367,120.6482781)
            , new LatLng(24.1798128,120.6482801)
            , new LatLng(24.1798728,120.6482734)
            , new LatLng(24.1798942,120.6482727)
            , new LatLng(24.1799193,120.648274)
            , new LatLng(24.1799419,120.6482727)
            , new LatLng(24.1797504,120.6482841)
            , new LatLng(24.1797725,120.6482808)
            , new LatLng(24.1797504,120.6482841)
            , new LatLng(24.1797725,120.6482808)
            , new LatLng(24.1807662,120.6478878)
            , new LatLng(24.1807665,120.6479133)
            , new LatLng(24.1807662,120.6479445)
            , new LatLng(24.1807677,120.6479703)
            , new LatLng(24.1807674,120.6479968)
            , new LatLng(24.1807683,120.6480196)
            , new LatLng(24.1807683,120.648044)
            , new LatLng(24.180768,120.6480903)
            , new LatLng(24.1807689,120.6481198)
            , new LatLng(24.1807696,120.6481503)
            , new LatLng(24.1807708,120.6481731)
            , new LatLng(24.1807671,120.6478271)
            , new LatLng(24.1807668,120.6478023)
            , new LatLng(24.1807668,120.6477799)
            , new LatLng(24.1807659,120.647754)
            , new LatLng(24.1807656,120.6477249)
            , new LatLng(24.1807647,120.6476997)
            , new LatLng(24.180765,120.6476742)
            , new LatLng(24.1807647,120.6476514)
            , new LatLng(24.1807705,120.6482352)
            , new LatLng(24.1799508,120.6482338)
    };

}
