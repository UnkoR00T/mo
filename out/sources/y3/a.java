package y3;

import fr.k;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.conscrypt.metrics.ConscryptStatsLog;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Ly3/a;", "", "", "keyCode", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(J)J", "", "T", "(J)Ljava/lang/String;", "", ip.a.f96137b, "(J)I", "other", "", "Q", "(JLjava/lang/Object;)Z", "a", "J", "getKeyCode", "()J", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long keyCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f223504c = i.a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f223510d = i.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f223516e = i.a(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f223522f = i.a(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f223528g = i.a(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f223534h = i.a(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f223540i = i.a(259);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f223546j = i.a(260);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f223552k = i.a(261);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f223558l = i.a(262);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f223564m = i.a(263);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f223570n = i.a(280);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f223576o = i.a(281);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f223582p = i.a(282);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f223588q = i.a(283);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f223594r = i.a(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f223600s = i.a(6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f223606t = i.a(19);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f223612u = i.a(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f223618v = i.a(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f223624w = i.a(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f223630x = i.a(23);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f223636y = i.a(268);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f223642z = i.a(269);
    private static final long A = i.a(270);
    private static final long B = i.a(271);
    private static final long C = i.a(24);
    private static final long D = i.a(25);
    private static final long E = i.a(26);
    private static final long F = i.a(27);
    private static final long G = i.a(28);
    private static final long H = i.a(7);
    private static final long I = i.a(8);
    private static final long J = i.a(9);
    private static final long K = i.a(10);
    private static final long L = i.a(11);
    private static final long M = i.a(12);
    private static final long N = i.a(13);
    private static final long O = i.a(14);
    private static final long P = i.a(15);
    private static final long Q = i.a(16);
    private static final long R = i.a(81);
    private static final long S = i.a(69);
    private static final long T = i.a(17);
    private static final long U = i.a(70);
    private static final long V = i.a(18);
    private static final long W = i.a(29);
    private static final long X = i.a(30);
    private static final long Y = i.a(31);
    private static final long Z = i.a(32);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final long f223493a0 = i.a(33);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final long f223499b0 = i.a(34);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final long f223505c0 = i.a(35);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final long f223511d0 = i.a(36);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final long f223517e0 = i.a(37);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final long f223523f0 = i.a(38);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final long f223529g0 = i.a(39);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final long f223535h0 = i.a(40);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final long f223541i0 = i.a(41);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final long f223547j0 = i.a(42);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final long f223553k0 = i.a(43);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final long f223559l0 = i.a(44);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final long f223565m0 = i.a(45);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final long f223571n0 = i.a(46);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final long f223577o0 = i.a(47);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final long f223583p0 = i.a(48);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final long f223589q0 = i.a(49);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final long f223595r0 = i.a(50);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final long f223601s0 = i.a(51);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final long f223607t0 = i.a(52);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final long f223613u0 = i.a(53);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final long f223619v0 = i.a(54);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final long f223625w0 = i.a(55);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final long f223631x0 = i.a(56);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final long f223637y0 = i.a(57);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final long f223643z0 = i.a(58);
    private static final long A0 = i.a(59);
    private static final long B0 = i.a(60);
    private static final long C0 = i.a(61);
    private static final long D0 = i.a(62);
    private static final long E0 = i.a(63);
    private static final long F0 = i.a(64);
    private static final long G0 = i.a(65);
    private static final long H0 = i.a(66);
    private static final long I0 = i.a(67);
    private static final long J0 = i.a(112);
    private static final long K0 = i.a(111);
    private static final long L0 = i.a(113);
    private static final long M0 = i.a(114);
    private static final long N0 = i.a(115);
    private static final long O0 = i.a(116);
    private static final long P0 = i.a(117);
    private static final long Q0 = i.a(118);
    private static final long R0 = i.a(119);
    private static final long S0 = i.a(120);
    private static final long T0 = i.a(121);
    private static final long U0 = i.a(122);
    private static final long V0 = i.a(123);
    private static final long W0 = i.a(124);
    private static final long X0 = i.a(277);
    private static final long Y0 = i.a(278);
    private static final long Z0 = i.a(279);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final long f223494a1 = i.a(68);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private static final long f223500b1 = i.a(71);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final long f223506c1 = i.a(72);

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final long f223512d1 = i.a(76);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final long f223518e1 = i.a(73);

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final long f223524f1 = i.a(74);

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final long f223530g1 = i.a(75);

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final long f223536h1 = i.a(77);

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final long f223542i1 = i.a(78);

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final long f223548j1 = i.a(79);

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final long f223554k1 = i.a(80);

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final long f223560l1 = i.a(82);

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final long f223566m1 = i.a(83);

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private static final long f223572n1 = i.a(84);

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final long f223578o1 = i.a(92);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final long f223584p1 = i.a(93);

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final long f223590q1 = i.a(94);

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final long f223596r1 = i.a(95);

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private static final long f223602s1 = i.a(96);

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final long f223608t1 = i.a(97);

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final long f223614u1 = i.a(98);

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static final long f223620v1 = i.a(99);

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static final long f223626w1 = i.a(100);

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final long f223632x1 = i.a(101);

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final long f223638y1 = i.a(102);

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private static final long f223644z1 = i.a(103);
    private static final long A1 = i.a(104);
    private static final long B1 = i.a(105);
    private static final long C1 = i.a(106);
    private static final long D1 = i.a(107);
    private static final long E1 = i.a(108);
    private static final long F1 = i.a(109);
    private static final long G1 = i.a(110);
    private static final long H1 = i.a(188);
    private static final long I1 = i.a(189);
    private static final long J1 = i.a(190);
    private static final long K1 = i.a(191);
    private static final long L1 = i.a(192);
    private static final long M1 = i.a(193);
    private static final long N1 = i.a(194);
    private static final long O1 = i.a(195);
    private static final long P1 = i.a(196);
    private static final long Q1 = i.a(197);
    private static final long R1 = i.a(198);
    private static final long S1 = i.a(199);
    private static final long T1 = i.a(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
    private static final long U1 = i.a(201);
    private static final long V1 = i.a(202);
    private static final long W1 = i.a(203);
    private static final long X1 = i.a(125);
    private static final long Y1 = i.a(131);
    private static final long Z1 = i.a(132);

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private static final long f223495a2 = i.a(133);

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private static final long f223501b2 = i.a(134);

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private static final long f223507c2 = i.a(135);

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private static final long f223513d2 = i.a(136);

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private static final long f223519e2 = i.a(137);

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private static final long f223525f2 = i.a(138);

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private static final long f223531g2 = i.a(139);

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private static final long f223537h2 = i.a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private static final long f223543i2 = i.a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private static final long f223549j2 = i.a(142);

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private static final long f223555k2 = i.a(143);

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    private static final long f223561l2 = i.a(144);

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private static final long f223567m2 = i.a(145);

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private static final long f223573n2 = i.a(146);

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private static final long f223579o2 = i.a(147);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final long f223585p2 = i.a(148);

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private static final long f223591q2 = i.a(149);

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private static final long f223597r2 = i.a(150);

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    private static final long f223603s2 = i.a(151);

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private static final long f223609t2 = i.a(152);

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    private static final long f223615u2 = i.a(153);

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private static final long f223621v2 = i.a(154);

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    private static final long f223627w2 = i.a(155);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final long f223633x2 = i.a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final long f223639y2 = i.a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private static final long f223645z2 = i.a(158);
    private static final long A2 = i.a(159);
    private static final long B2 = i.a(160);
    private static final long C2 = i.a(161);
    private static final long D2 = i.a(162);
    private static final long E2 = i.a(163);
    private static final long F2 = i.a(126);
    private static final long G2 = i.a(CertificateBody.profileType);
    private static final long H2 = i.a(85);
    private static final long I2 = i.a(86);
    private static final long J2 = i.a(130);
    private static final long K2 = i.a(87);
    private static final long L2 = i.a(88);
    private static final long M2 = i.a(89);
    private static final long N2 = i.a(90);
    private static final long O2 = i.a(128);
    private static final long P2 = i.a(222);
    private static final long Q2 = i.a(129);
    private static final long R2 = i.a(226);
    private static final long S2 = i.a(272);
    private static final long T2 = i.a(273);
    private static final long U2 = i.a(274);
    private static final long V2 = i.a(275);
    private static final long W2 = i.a(91);
    private static final long X2 = i.a(164);
    private static final long Y2 = i.a(165);
    private static final long Z2 = i.a(166);

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    private static final long f223496a3 = i.a(167);

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    private static final long f223502b3 = i.a(168);

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    private static final long f223508c3 = i.a(169);

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final long f223514d3 = i.a(170);

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    private static final long f223520e3 = i.a(171);

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    private static final long f223526f3 = i.a(172);

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final long f223532g3 = i.a(173);

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final long f223538h3 = i.a(174);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final long f223544i3 = i.a(175);

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final long f223550j3 = i.a(176);

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final long f223556k3 = i.a(177);

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final long f223562l3 = i.a(178);

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final long f223568m3 = i.a(179);

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final long f223574n3 = i.a(180);

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final long f223580o3 = i.a(181);

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final long f223586p3 = i.a(182);

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final long f223592q3 = i.a(183);

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final long f223598r3 = i.a(184);

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final long f223604s3 = i.a(185);

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final long f223610t3 = i.a(186);

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final long f223616u3 = i.a(187);

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final long f223622v3 = i.a(204);

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final long f223628w3 = i.a(205);

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final long f223634x3 = i.a(206);

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final long f223640y3 = i.a(207);

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final long f223646z3 = i.a(208);
    private static final long A3 = i.a(209);
    private static final long B3 = i.a(210);
    private static final long C3 = i.a(Primes.SMALL_FACTOR_LIMIT);
    private static final long D3 = i.a(212);
    private static final long E3 = i.a(213);
    private static final long F3 = i.a(214);
    private static final long G3 = i.a(215);
    private static final long H3 = i.a(216);
    private static final long I3 = i.a(217);
    private static final long J3 = i.a(218);
    private static final long K3 = i.a(219);
    private static final long L3 = i.a(220);
    private static final long M3 = i.a(221);
    private static final long N3 = i.a(223);
    private static final long O3 = i.a(BERTags.FLAGS);
    private static final long P3 = i.a(276);
    private static final long Q3 = i.a(225);
    private static final long R3 = i.a(229);
    private static final long S3 = i.a(230);
    private static final long T3 = i.a(231);
    private static final long U3 = i.a(232);
    private static final long V3 = i.a(233);
    private static final long W3 = i.a(234);
    private static final long X3 = i.a(235);
    private static final long Y3 = i.a(236);
    private static final long Z3 = i.a(237);

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final long f223497a4 = i.a(238);

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final long f223503b4 = i.a(239);

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final long f223509c4 = i.a(240);

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final long f223515d4 = i.a(241);

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final long f223521e4 = i.a(242);

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final long f223527f4 = i.a(243);

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final long f223533g4 = i.a(244);

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final long f223539h4 = i.a(245);

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final long f223545i4 = i.a(246);

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final long f223551j4 = i.a(247);

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final long f223557k4 = i.a(248);

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final long f223563l4 = i.a(249);

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final long f223569m4 = i.a(250);

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final long f223575n4 = i.a(251);

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final long f223581o4 = i.a(252);

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final long f223587p4 = i.a(253);

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final long f223593q4 = i.a(254);

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final long f223599r4 = i.a(GF2Field.MASK);

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final long f223605s4 = i.a(256);

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final long f223611t4 = i.a(257);

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final long f223617u4 = i.a(258);

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final long f223623v4 = i.a(264);

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final long f223629w4 = i.a(265);

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final long f223635x4 = i.a(266);

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private static final long f223641y4 = i.a(267);

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private static final long f223647z4 = i.a(284);
    private static final long A4 = i.a(285);
    private static final long B4 = i.a(286);
    private static final long C4 = i.a(287);
    private static final long D4 = i.a(288);
    private static final long E4 = i.a(-1000000001);
    private static final long F4 = i.a(-1000000002);
    private static final long G4 = i.a(-1000000003);
    private static final long H4 = i.a(-1000000004);
    private static final long I4 = i.a(-1000000005);
    private static final long J4 = i.a(-1000000006);
    private static final long K4 = i.a(-1000000007);
    private static final long L4 = i.a(-1000000008);
    private static final long M4 = i.a(-1000000009);
    private static final long N4 = i.a(-1000000010);

    /* JADX INFO: renamed from: y3.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bO\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u0006\u0010\bR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010L\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR\u0017\u0010R\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b\u0017\u0010\b¨\u0006S"}, d2 = {"Ly3/a$a;", "", "<init>", "()V", "Ly3/a;", "Back", "J", "b", "()J", "NavigatePrevious", "u", "NavigateNext", "t", "DirectionUp", "m", "DirectionDown", "j", "DirectionLeft", "k", "DirectionRight", "l", "DirectionCenter", "i", "A", "a", "C", "e", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "p", "V", "K", "X", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Y", "M", "Z", "N", "Tab", "Spacebar", "I", "Enter", "n", "Backspace", "d", "Delete", "h", "Escape", "o", "MoveHome", "s", "MoveEnd", "r", "Insert", "q", "Cut", "g", "Copy", "f", "Paste", "Backslash", "c", "PageUp", "G", "PageDown", "F", "NumPadEnter", "z", "NumPadDirectionUp", "y", "NumPadDirectionDown", "v", "NumPadDirectionLeft", "w", "NumPadDirectionRight", "x", "NumPadMoveHome", "NumPadMoveEnd", "B", "NumPadPageUp", "E", "NumPadPageDown", ip.a.f96138c, "NumPadInsert", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final long A() {
            return a.M4;
        }

        public final long B() {
            return a.J4;
        }

        public final long C() {
            return a.I4;
        }

        public final long D() {
            return a.L4;
        }

        public final long E() {
            return a.K4;
        }

        public final long F() {
            return a.f223584p1;
        }

        public final long G() {
            return a.f223578o1;
        }

        public final long H() {
            return a.Z0;
        }

        public final long I() {
            return a.D0;
        }

        public final long J() {
            return a.C0;
        }

        public final long K() {
            return a.f223595r0;
        }

        public final long L() {
            return a.f223607t0;
        }

        public final long M() {
            return a.f223613u0;
        }

        public final long N() {
            return a.f223619v0;
        }

        public final long a() {
            return a.W;
        }

        public final long b() {
            return a.f223534h;
        }

        public final long c() {
            return a.f223518e1;
        }

        public final long d() {
            return a.I0;
        }

        public final long e() {
            return a.Y;
        }

        public final long f() {
            return a.Y0;
        }

        public final long g() {
            return a.X0;
        }

        public final long h() {
            return a.J0;
        }

        public final long i() {
            return a.f223630x;
        }

        public final long j() {
            return a.f223612u;
        }

        public final long k() {
            return a.f223618v;
        }

        public final long l() {
            return a.f223624w;
        }

        public final long m() {
            return a.f223606t;
        }

        public final long n() {
            return a.H0;
        }

        public final long o() {
            return a.K0;
        }

        public final long p() {
            return a.f223511d0;
        }

        public final long q() {
            return a.W0;
        }

        public final long r() {
            return a.V0;
        }

        public final long s() {
            return a.U0;
        }

        public final long t() {
            return a.f223552k;
        }

        public final long u() {
            return a.f223546j;
        }

        public final long v() {
            return a.F4;
        }

        public final long w() {
            return a.G4;
        }

        public final long x() {
            return a.H4;
        }

        public final long y() {
            return a.E4;
        }

        public final long z() {
            return a.B2;
        }

        private Companion() {
        }
    }

    private /* synthetic */ a(long j15) {
        this.keyCode = j15;
    }

    public static final /* synthetic */ a O(long j15) {
        return new a(j15);
    }

    public static long P(long j15) {
        return j15;
    }

    public static boolean Q(long j15, Object obj) {
        return (obj instanceof a) && j15 == ((a) obj).getKeyCode();
    }

    public static final boolean R(long j15, long j16) {
        return j15 == j16;
    }

    public static int S(long j15) {
        return Long.hashCode(j15);
    }

    public static String T(long j15) {
        return "Key code: " + j15;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final /* synthetic */ long getKeyCode() {
        return this.keyCode;
    }

    public boolean equals(Object obj) {
        return Q(this.keyCode, obj);
    }

    public int hashCode() {
        return S(this.keyCode);
    }

    public String toString() {
        return T(this.keyCode);
    }
}
