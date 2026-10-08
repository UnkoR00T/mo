package wv;

import fr.l0;
import fr.o0;
import fr.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import oq.i0;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.hpke.HPKE;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import vv.b0;
import vv.n0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0018\u00101\u001a\u00020.*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lvv/b0;", "zipPath", "Lvv/k;", "fileSystem", "Lkotlin/Function1;", "Lwv/n;", "", "predicate", "Lvv/n0;", "i", "(Lvv/b0;Lvv/k;Ler/l;)Lvv/n0;", "", "entries", "", "e", "(Ljava/util/List;)Ljava/util/Map;", "Lvv/g;", "l", "(Lvv/g;)Lwv/n;", "Lwv/h;", "o", "(Lvv/g;)Lwv/h;", "regularRecord", "t", "(Lvv/g;Lwv/h;)Lwv/h;", "", "extraSize", "Lkotlin/Function2;", "", "Loq/i0;", "block", "p", "(Lvv/g;ILer/p;)V", "u", "(Lvv/g;)V", "centralDirectoryZipEntry", "q", "(Lvv/g;Lwv/n;)Lwv/n;", "r", "filetime", "g", "(J)J", "date", "time", "f", "(II)Ljava/lang/Long;", "", "h", "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((n) t15).getCanonicalPath(), ((n) t16).getCanonicalPath());
        }
    }

    private static final Map<b0, n> e(List<n> list) {
        b0 b0VarE = b0.Companion.e(b0.INSTANCE, "/", false, 1, null);
        Map<b0, n> mapM = v0.m(y.a(b0VarE, new n(b0VarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (n nVar : v.U0(list, new a())) {
            if (mapM.put(nVar.getCanonicalPath(), nVar) == null) {
                while (true) {
                    b0 b0VarN = nVar.getCanonicalPath().n();
                    if (b0VarN == null) {
                        break;
                    }
                    n nVar2 = mapM.get(b0VarN);
                    if (nVar2 != null) {
                        nVar2.c().add(nVar.getCanonicalPath());
                        break;
                    }
                    n nVar3 = new n(b0VarN, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapM.put(b0VarN, nVar3);
                    nVar3.c().add(nVar.getCanonicalPath());
                    nVar = nVar3;
                }
            }
        }
        return mapM;
    }

    public static final Long f(int i15, int i16) {
        if (i16 == -1) {
            return null;
        }
        return Long.valueOf(u.a(((i15 >> 9) & CertificateBody.profileType) + 1980, (i15 >> 5) & 15, i15 & 31, (i16 >> 11) & 31, (i16 >> 5) & 63, (i16 & 31) << 1));
    }

    public static final long g(long j15) {
        return (j15 / ((long) 10000)) - 11644473600000L;
    }

    private static final String h(int i15) {
        return "0x" + Integer.toString(i15, fu.a.a(16));
    }

    public static final n0 i(b0 b0Var, vv.k kVar, er.l<? super n, Boolean> lVar) {
        Throwable th4;
        Throwable th5;
        Throwable th6;
        vv.i iVarL = kVar.L(b0Var);
        try {
            long size = iVarL.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + iVarL.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                vv.g gVarC = vv.v.c(iVarL.H(size));
                try {
                    if (gVarC.B3() == 101010256) {
                        h hVarO = o(gVarC);
                        String strN2 = gVarC.n2(hVarO.getCommentByteCount());
                        gVarC.close();
                        long j15 = size - ((long) 20);
                        Throwable th7 = null;
                        if (j15 > 0) {
                            vv.g gVarC2 = vv.v.c(iVarL.H(j15));
                            try {
                                if (gVarC2.B3() == 117853008) {
                                    int iB3 = gVarC2.B3();
                                    long jY1 = gVarC2.Y1();
                                    if (gVarC2.B3() != 1 || iB3 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    vv.g gVarC3 = vv.v.c(iVarL.H(jY1));
                                    try {
                                        int iB4 = gVarC3.B3();
                                        if (iB4 != 101075792) {
                                            throw new IOException("bad zip: expected " + h(101075792) + " but was " + h(iB4));
                                        }
                                        hVarO = t(gVarC3, hVarO);
                                        i0 i0Var = i0.f148189a;
                                        if (gVarC3 != null) {
                                            try {
                                                gVarC3.close();
                                            } catch (Throwable th8) {
                                                th6 = th8;
                                            }
                                        }
                                        th6 = null;
                                        if (th6 != null) {
                                            throw th6;
                                        }
                                    } catch (Throwable th9) {
                                        if (gVarC3 != null) {
                                            try {
                                                gVarC3.close();
                                                i0 i0Var2 = i0.f148189a;
                                            } catch (Throwable th10) {
                                                try {
                                                    oq.c.a(th9, th10);
                                                } catch (Throwable th11) {
                                                    th4 = th11;
                                                    hVarO = hVarO;
                                                    if (gVarC2 != null) {
                                                        try {
                                                            gVarC2.close();
                                                            i0 i0Var3 = i0.f148189a;
                                                        } catch (Throwable th12) {
                                                            oq.c.a(th4, th12);
                                                        }
                                                    }
                                                    th5 = th4;
                                                }
                                            }
                                        }
                                        th6 = th9;
                                        hVarO = hVarO;
                                    }
                                }
                                i0 i0Var4 = i0.f148189a;
                                if (gVarC2 != null) {
                                    try {
                                        gVarC2.close();
                                    } catch (Throwable th13) {
                                        th5 = th13;
                                    }
                                }
                                th5 = null;
                            } catch (Throwable th14) {
                                th4 = th14;
                            }
                            if (th5 != null) {
                                throw th5;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        vv.g gVarC4 = vv.v.c(iVarL.H(hVarO.getCentralDirectoryOffset()));
                        try {
                            long entryCount = hVarO.getEntryCount();
                            for (long j16 = 0; j16 < entryCount; j16++) {
                                n nVarL = l(gVarC4);
                                if (nVarL.getOffset() >= hVarO.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (lVar.b(nVarL).booleanValue()) {
                                    arrayList.add(nVarL);
                                }
                            }
                            i0 i0Var5 = i0.f148189a;
                            if (gVarC4 != null) {
                                try {
                                    gVarC4.close();
                                } catch (Throwable th15) {
                                    th7 = th15;
                                }
                            }
                        } catch (Throwable th16) {
                            if (gVarC4 != null) {
                                try {
                                    gVarC4.close();
                                    i0 i0Var6 = i0.f148189a;
                                } catch (Throwable th17) {
                                    oq.c.a(th16, th17);
                                }
                            }
                            th7 = th16;
                        }
                        if (th7 != null) {
                            throw th7;
                        }
                        n0 n0Var = new n0(b0Var, kVar, e(arrayList), strN2);
                        if (iVarL != null) {
                            try {
                                iVarL.close();
                                i0 i0Var7 = i0.f148189a;
                            } catch (Throwable unused) {
                            }
                        }
                        return n0Var;
                    }
                    gVarC.close();
                    size--;
                } catch (Throwable th18) {
                    gVarC.close();
                    throw th18;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th19) {
            if (iVarL == null) {
                throw th19;
            }
            try {
                iVarL.close();
                i0 i0Var8 = i0.f148189a;
                throw th19;
            } catch (Throwable th20) {
                oq.c.a(th19, th20);
                throw th19;
            }
        }
    }

    public static /* synthetic */ n0 j(b0 b0Var, vv.k kVar, er.l lVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            lVar = new er.l() { // from class: wv.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return Boolean.valueOf(s.k((n) obj2));
                }
            };
        }
        return i(b0Var, kVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(n nVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n l(final vv.g gVar) throws IOException {
        int iB3 = gVar.B3();
        if (iB3 != 33639248) {
            throw new IOException("bad zip: expected " + h(33639248) + " but was " + h(iB3));
        }
        gVar.skip(4L);
        short sW1 = gVar.W1();
        int i15 = sW1 & HPKE.aead_EXPORT_ONLY;
        if ((sW1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i15));
        }
        int iW1 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        int iW2 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        int iW3 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        long jB3 = ((long) gVar.B3()) & BodyPartID.bodyIdMax;
        final o0 o0Var = new o0();
        o0Var.f66408a = ((long) gVar.B3()) & BodyPartID.bodyIdMax;
        final o0 o0Var2 = new o0();
        o0Var2.f66408a = ((long) gVar.B3()) & BodyPartID.bodyIdMax;
        int iW4 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        int iW5 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        int iW6 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        gVar.skip(8L);
        final o0 o0Var3 = new o0();
        o0Var3.f66408a = ((long) gVar.B3()) & BodyPartID.bodyIdMax;
        String strN2 = gVar.n2(iW4);
        if (fu.r.c0(strN2, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j15 = o0Var2.f66408a == BodyPartID.bodyIdMax ? 8 : 0L;
        if (o0Var.f66408a == BodyPartID.bodyIdMax) {
            j15 += (long) 8;
        }
        if (o0Var3.f66408a == BodyPartID.bodyIdMax) {
            j15 += (long) 8;
        }
        final long j16 = j15;
        final p0 p0Var = new p0();
        final p0 p0Var2 = new p0();
        final p0 p0Var3 = new p0();
        final l0 l0Var = new l0();
        p(gVar, iW5, new er.p() { // from class: wv.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return s.m(l0Var, j16, o0Var2, gVar, o0Var, o0Var3, p0Var, p0Var2, p0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j16 <= 0 || l0Var.f66404a) {
            return new n(b0.Companion.e(b0.INSTANCE, "/", false, 1, null).p(strN2), fu.r.F(strN2, "/", false, 2, null), gVar.n2(iW6), jB3, o0Var.f66408a, o0Var2.f66408a, iW1, o0Var3.f66408a, iW3, iW2, (Long) p0Var.f66410a, (Long) p0Var2.f66410a, (Long) p0Var3.f66410a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l0 l0Var, long j15, o0 o0Var, final vv.g gVar, o0 o0Var2, o0 o0Var3, final p0 p0Var, final p0 p0Var2, final p0 p0Var3, int i15, long j16) throws IOException {
        if (i15 != 1) {
            if (i15 == 10) {
                if (j16 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                gVar.skip(4L);
                p(gVar, (int) (j16 - 4), new er.p() { // from class: wv.p
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.n(p0Var, gVar, p0Var2, p0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (l0Var.f66404a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            l0Var.f66404a = true;
            if (j16 < j15) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jY1 = o0Var.f66408a;
            if (jY1 == BodyPartID.bodyIdMax) {
                jY1 = gVar.Y1();
            }
            o0Var.f66408a = jY1;
            o0Var2.f66408a = o0Var2.f66408a == BodyPartID.bodyIdMax ? gVar.Y1() : 0L;
            o0Var3.f66408a = o0Var3.f66408a == BodyPartID.bodyIdMax ? gVar.Y1() : 0L;
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final i0 n(p0 p0Var, vv.g gVar, p0 p0Var2, p0 p0Var3, int i15, long j15) throws IOException {
        if (i15 == 1) {
            if (p0Var.f66410a != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j15 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            p0Var.f66410a = Long.valueOf(gVar.Y1());
            p0Var2.f66410a = Long.valueOf(gVar.Y1());
            p0Var3.f66410a = Long.valueOf(gVar.Y1());
        }
        return i0.f148189a;
    }

    private static final h o(vv.g gVar) throws IOException {
        int iW1 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        int iW2 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        long jW1 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        if (jW1 != (gVar.W1() & HPKE.aead_EXPORT_ONLY) || iW1 != 0 || iW2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(4L);
        return new h(jW1, BodyPartID.bodyIdMax & ((long) gVar.B3()), gVar.W1() & HPKE.aead_EXPORT_ONLY);
    }

    private static final void p(vv.g gVar, int i15, er.p<? super Integer, ? super Long, i0> pVar) throws IOException {
        long j15 = i15;
        while (j15 != 0) {
            if (j15 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iW1 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
            long jW1 = ((long) gVar.W1()) & 65535;
            long j16 = j15 - ((long) 4);
            if (j16 < jW1) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            gVar.g2(jW1);
            long size = gVar.getBufferField().getSize();
            pVar.B(Integer.valueOf(iW1), Long.valueOf(jW1));
            long size2 = (gVar.getBufferField().getSize() + jW1) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iW1);
            }
            if (size2 > 0) {
                gVar.getBufferField().skip(size2);
            }
            j15 = j16 - jW1;
        }
    }

    public static final n q(vv.g gVar, n nVar) {
        return r(gVar, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final n r(final vv.g gVar, n nVar) throws IOException {
        int iB3 = gVar.B3();
        if (iB3 != 67324752) {
            throw new IOException("bad zip: expected " + h(67324752) + " but was " + h(iB3));
        }
        gVar.skip(2L);
        short sW1 = gVar.W1();
        int i15 = sW1 & HPKE.aead_EXPORT_ONLY;
        if ((sW1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i15));
        }
        gVar.skip(18L);
        long jW1 = ((long) gVar.W1()) & 65535;
        int iW1 = gVar.W1() & HPKE.aead_EXPORT_ONLY;
        gVar.skip(jW1);
        if (nVar == null) {
            gVar.skip(iW1);
            return null;
        }
        final p0 p0Var = new p0();
        final p0 p0Var2 = new p0();
        final p0 p0Var3 = new p0();
        p(gVar, iW1, new er.p() { // from class: wv.q
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return s.s(gVar, p0Var, p0Var2, p0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return nVar.a((Integer) p0Var.f66410a, (Integer) p0Var2.f66410a, (Integer) p0Var3.f66410a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final i0 s(vv.g gVar, p0 p0Var, p0 p0Var2, p0 p0Var3, int i15, long j15) throws IOException {
        if (i15 == 21589) {
            if (j15 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b15 = gVar.readByte();
            boolean z15 = (b15 & 1) == 1;
            boolean z16 = (b15 & 2) == 2;
            boolean z17 = (b15 & 4) == 4;
            long j16 = z15 ? 5L : 1L;
            if (z16) {
                j16 += 4;
            }
            if (z17) {
                j16 += 4;
            }
            if (j15 < j16) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z15) {
                p0Var.f66410a = Integer.valueOf(gVar.B3());
            }
            if (z16) {
                p0Var2.f66410a = Integer.valueOf(gVar.B3());
            }
            if (z17) {
                p0Var3.f66410a = Integer.valueOf(gVar.B3());
            }
        }
        return i0.f148189a;
    }

    private static final h t(vv.g gVar, h hVar) throws IOException {
        gVar.skip(12L);
        int iB3 = gVar.B3();
        int iB4 = gVar.B3();
        long jY1 = gVar.Y1();
        if (jY1 != gVar.Y1() || iB3 != 0 || iB4 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(8L);
        return new h(jY1, gVar.Y1(), hVar.getCommentByteCount());
    }

    public static final void u(vv.g gVar) throws IOException {
        r(gVar, null);
    }
}
