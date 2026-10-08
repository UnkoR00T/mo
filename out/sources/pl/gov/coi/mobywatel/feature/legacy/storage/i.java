package pl.gov.coi.mobywatel.feature.legacy.storage;

import er.p;
import i34.IdentityDeactivateData;
import iy.b0;
import iy.c0;
import iy.v;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import ju.d2;
import ju.g1;
import ju.p0;
import ju.q0;
import k34.DocumentCertsSet;
import k34.u;
import mu.a0;
import mu.h0;
import oq.i0;
import oq.r;
import oq.x;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import pq.v0;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020!0\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u0018J\u0015\u0010$\u001a\u0004\u0018\u00010\u0019*\u00020#H\u0002¢\u0006\u0004\b$\u0010%J-\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020(0\u00142\u0006\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J=\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020(0\u00142\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002040\u0014H\u0002¢\u0006\u0004\b5\u00106J#\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002070\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b8\u0010\u0018J#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u00109\u001a\u00020#H\u0002¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J/\u0010A\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00120@0\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020+0\u00142\u0006\u0010C\u001a\u00020\u0012H\u0002¢\u0006\u0004\bD\u0010\u0018J#\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020-0\u00142\u0006\u0010E\u001a\u00020\u0012H\u0002¢\u0006\u0004\bF\u0010\u0018J#\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010G\u001a\u000207H\u0002¢\u0006\u0004\bH\u0010IJ!\u0010K\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002070J0\u0014H\u0002¢\u0006\u0004\bK\u00106J$\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020!0\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\bL\u0010MJ#\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\bN\u0010\u001cJ#\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\bO\u0010BJ\u001b\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001d0\u0014H\u0016¢\u0006\u0004\bP\u00106J\u0019\u0010Q\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020(H\u0096@¢\u0006\u0004\bS\u0010TJ<\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020(0\u00142\u0006\u00109\u001a\u00020#2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020UH\u0096@¢\u0006\u0004\bZ\u0010[J$\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001d0\u00142\u0006\u00109\u001a\u00020#H\u0096@¢\u0006\u0004\b\\\u0010]J$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020!0\u00142\u0006\u00109\u001a\u00020#H\u0096@¢\u0006\u0004\b^\u0010]J(\u0010`\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0_0\u0014H\u0096@¢\u0006\u0004\b`\u0010TJ\u001a\u0010b\u001a\u0004\u0018\u00010#2\u0006\u0010a\u001a\u00020#H\u0096@¢\u0006\u0004\bb\u0010]J$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020!0\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\bc\u0010MJ\u0015\u0010e\u001a\u00020!2\u0006\u0010d\u001a\u00020!¢\u0006\u0004\be\u0010fJ\u0015\u0010h\u001a\b\u0012\u0004\u0012\u00020(0gH\u0016¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020(H\u0096@¢\u0006\u0004\bj\u0010TR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010nR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010oR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010pR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010qR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010rR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020(0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010s¨\u0006u"}, d2 = {"Lpl/gov/coi/mobywatel/feature/legacy/storage/i;", "Lg34/c;", "Lpl/gov/coi/mobywatel/feature/legacy/storage/l;", "serviceToContainerIdMapper", "Liy/v;", "pkcs12Manager", "Liy/c;", "bytesConverter", "Liy/d;", "bytesGenerator", "Lpx/d;", "remoteLogger", "Liy/a;", "base64Coder", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "<init>", "(Lpl/gov/coi/mobywatel/feature/legacy/storage/l;Liy/v;Liy/c;Liy/d;Lpx/d;Liy/a;Liy/l;)V", "", "bundleId", "Ldx/i;", "Ldx/b;", "Lry/c;", "z", "(I)Ldx/i;", "Lk34/u;", "identityType", "w", "(Lk34/u;)Ldx/i;", "", "withValidCert", "x", "(Z)Ljava/lang/Integer;", "", ip.a.f96138c, "Lrq0/b;", "K", "(Lrq0/b;)Lk34/u;", "activeServiceId", "isCertRevoked", "Loq/i0;", "I", "(IZ)Ldx/i;", "Lbj2/c;", "userContainer", "Lbj2/b;", "passContainer", "", "pkcs12", "newPass", "r", "(Lbj2/c;Lbj2/b;[B[B)Ldx/i;", "Lcj2/b;", "A", "()Ldx/i;", "Lcj2/a;", "t", "documentType", "v", "(Lrq0/b;)Ldx/i;", "Laj2/a;", "services", "u", "(Laj2/a;)Ldx/i;", "Loq/r;", "E", "(Z)Ldx/i;", "containerUserBundleId", "C", "containerPassBundleId", "B", "bundleDescription", "G", "(Lcj2/a;)Ldx/i;", "", "s", "l", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "m", "g", "c", "h", "(Z)Lrq0/b;", "k", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "peselTicket", "Liy/a0;", "certPkcs12", "password", "i", "(Lrq0/b;Liy/b0;Liy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "j", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "p", "", "d", "document", "f", "e", "data", "F", "(Ljava/lang/String;)Ljava/lang/String;", "Lmu/a0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lmu/a0;", "a", "Lpl/gov/coi/mobywatel/feature/legacy/storage/l;", "b", "Liy/v;", "Liy/c;", "Liy/d;", "Lpx/d;", "Liy/a;", "Liy/l;", "Lmu/a0;", "mainIdentityCertificateChanged", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements g34.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l serviceToContainerIdMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v pkcs12Manager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.d bytesGenerator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iy.l digest;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a0<i0> mainIdentityCertificateChanged = h0.b(0, 0, null, 7, null);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f158784b;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.MOBYWATEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.DIIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.STUDENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f158783a = iArr;
            int[] iArr2 = new int[aj2.a.values().length];
            try {
                iArr2[aj2.a.TOZSAMOSC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[aj2.a.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[aj2.a.STUDENT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f158784b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        Object A;
        Object B;
        Object C;
        Object D;
        /* synthetic */ Object E;
        int G;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f158785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f158788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158789h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158790j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158791k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158792l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158793m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f158794n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f158795p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f158796q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f158797r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f158798s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f158799t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f158800v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f158801w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f158802x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f158803y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        Object f158804z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.E = obj;
            this.G |= PKIFailureInfo.systemUnavail;
            return i.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lju/d2;", "<anonymous>", "(Lju/p0;)Lju/d2;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super d2>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158805e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lju/d2;", "<anonymous>", "(Lju/p0;)Lju/d2;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<p0, tq.e<? super d2>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f158807e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f158808f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ i f158809g;

            /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.legacy.storage.i$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            static final class C3939a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f158810e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ i f158811f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C3939a(i iVar, tq.e<? super C3939a> eVar) {
                    super(2, eVar);
                    this.f158811f = iVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f158810e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        a0 a0Var = this.f158811f.mainIdentityCertificateChanged;
                        i0 i0Var = i0.f148189a;
                        this.f158810e = 1;
                        if (a0Var.F(i0Var, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((C3939a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C3939a(this.f158811f, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f158809g = iVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                p0 p0Var = (p0) this.f158808f;
                uq.b.e();
                if (this.f158807e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return ju.k.d(p0Var, null, null, new C3939a(this.f158809g, null), 3, null);
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super d2> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f158809g, eVar);
                aVar.f158808f = obj;
                return aVar;
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158805e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            a aVar = new a(i.this, null);
            this.f158805e = 1;
            Object objE2 = q0.e(aVar, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super d2> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return i.this.new c(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {
        int A;
        /* synthetic */ Object B;
        int D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158816h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158817j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158818k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158819l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f158820m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f158821n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f158822p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f158823q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f158824r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f158825s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f158826t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f158827v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f158828w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f158829x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f158830y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f158831z;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.B = obj;
            this.D |= PKIFailureInfo.systemUnavail;
            return i.this.i(null, null, null, null, this);
        }
    }

    public i(l lVar, v vVar, iy.c cVar, iy.d dVar, px.d dVar2, iy.a aVar, iy.l lVar2) {
        this.serviceToContainerIdMapper = lVar;
        this.pkcs12Manager = vVar;
        this.bytesConverter = cVar;
        this.bytesGenerator = dVar;
        this.remoteLogger = dVar2;
        this.base64Coder = aVar;
        this.digest = lVar2;
    }

    private final dx.i<dx.b, cj2.b> A() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVarR = ContainerManagerNew.u().r();
                    if (bVarR != null) {
                        return new dx.i.Right(bVarR);
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("IdentityManager, commonContainer is null")));
                    throw new oq.g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, bj2.b> B(int containerPassBundleId) {
        Object objB;
        dx.i<dx.b, bj2.b> left;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.b bVar = (bj2.b) ContainerManagerNew.u().z(bj2.b.class, containerPassBundleId, pl.gov.coi.mobywatel.feature.legacy.storage.d.PASS);
                    if (bVar != null) {
                        left = new dx.i.Right<>(bVar);
                        if (left instanceof dx.i.Left) {
                            px.b.y5(this.remoteLogger, "IdentityManager, getContainerPass error", null, px.c.a(this), 2, null);
                        }
                        return left;
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("IdentityManager, containerPass with id:" + containerPassBundleId + " is null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            left = new dx.i.Left<>(objB);
        }
    }

    private final dx.i<dx.b, bj2.c> C(int containerUserBundleId) {
        Object objB;
        dx.i<dx.b, bj2.c> left;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.c cVar = (bj2.c) ContainerManagerNew.u().z(bj2.c.class, containerUserBundleId, pl.gov.coi.mobywatel.feature.legacy.storage.d.USER);
                    if (cVar != null) {
                        left = new dx.i.Right<>(cVar);
                        if (left instanceof dx.i.Left) {
                            px.b.y5(this.remoteLogger, "IdentityManager, getContainerUser error", null, px.c.a(this), 2, null);
                        }
                        return left;
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("IdentityManager, containerUser with id:" + containerUserBundleId + " is null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            left = new dx.i.Left<>(objB);
        }
    }

    private final dx.i<dx.b, String> D(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.c cVar = (bj2.c) aVar.a(C(bundleId));
                    String str = ((di2.a) new com.google.gson.f().i(StandardCharsets.UTF_8.decode(ByteBuffer.wrap((byte[]) new CMSSignedData(cVar.p()).getSignedContent().getContent())).toString(), di2.a.class)).f42826e;
                    cVar.f();
                    if (str != null) {
                        return new dx.i.Right(F(str));
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("IdentityManager error, documentId is null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final dx.i<dx.b, r<aj2.a, Integer>> E(boolean withValidCert) {
        Object objB;
        Object obj;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    Iterator it = v0.y(((cj2.b) aVar.a(A())).h(Boolean.valueOf(withValidCert))).iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (it.hasNext()) {
                            aj2.a aVar2 = (aj2.a) ((r) next).a();
                            do {
                                Object next2 = it.next();
                                aj2.a aVar3 = (aj2.a) ((r) next2).a();
                                if (aVar2.compareTo(aVar3) > 0) {
                                    next = next2;
                                    aVar2 = aVar3;
                                }
                            } while (it.hasNext());
                        }
                        obj = next;
                    } else {
                        obj = null;
                    }
                    r rVar = (r) obj;
                    if (rVar != null) {
                        return new dx.i.Right(rVar);
                    }
                    aVar.b(new dx.b.Generic(new NoSuchElementException("IdentityManager error, there is no main service with " + withValidCert + " cert")));
                    throw new oq.g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, Integer> G(cj2.a bundleDescription) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(Integer.valueOf(ContainerManagerNew.u().w(bundleDescription)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final dx.i<dx.b, i0> I(int activeServiceId, boolean isCertRevoked) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVar = (cj2.b) aVar.a(A());
                    cj2.a aVar2 = (cj2.a) aVar.a(t(activeServiceId));
                    aVar2.n(isCertRevoked);
                    bVar.v(activeServiceId, aVar2);
                    bVar.c();
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    static /* synthetic */ dx.i J(i iVar, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        return iVar.I(i15, z15);
    }

    private final u K(rq0.b bVar) {
        if (bVar == rq0.b.d.ID_CARD) {
            return u.MOBYWATEL;
        }
        if (bVar == rq0.b.d.DIIA_REFUGEE_CARD) {
            return u.DIIA;
        }
        if (bVar == rq0.b.d.STUDENT_CARD) {
            return u.STUDENT;
        }
        return null;
    }

    private final dx.i<dx.b, i0> r(bj2.c userContainer, bj2.b passContainer, byte[] pkcs12, byte[] newPass) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    HashMap<String, byte[]> mapT = userContainer.t();
                    if (mapT == null) {
                        mapT = new HashMap<>();
                    }
                    HashMap<String, byte[]> mapF = passContainer.f();
                    if (mapF == null) {
                        mapF = new HashMap<>();
                    }
                    String string = UUID.randomUUID().toString();
                    mapT.put(string, pkcs12);
                    mapF.put(string, sh2.a.d().a(newPass));
                    userContainer.P(mapT);
                    userContainer.Q(string);
                    userContainer.F(Boolean.FALSE);
                    passContainer.g(mapF);
                    return new dx.i.Right(i0.f148189a);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final dx.i<dx.b, List<cj2.a>> s() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.b) new ex.a().a(A())).g());
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, cj2.a> t(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.b) new ex.a().a(A())).k(bundleId));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, Integer> u(aj2.a services) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(Integer.valueOf(((cj2.b) new ex.a().a(A())).m(services)));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, Integer> v(rq0.b documentType) {
        return u(n.a(documentType));
    }

    private final dx.i<dx.b, Integer> w(u identityType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    int i15 = a.f158783a[identityType.ordinal()];
                    if (i15 == 1) {
                        return v(rq0.b.d.ID_CARD);
                    }
                    if (i15 == 2) {
                        return v(rq0.b.d.DIIA_REFUGEE_CARD);
                    }
                    if (i15 == 3) {
                        return v(rq0.b.d.STUDENT_CARD);
                    }
                    throw new oq.p();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final Integer x(boolean withValidCert) {
        r<aj2.a, Integer> rVarA = E(withValidCert).a();
        if (rVarA != null) {
            return rVarA.d();
        }
        return null;
    }

    static /* synthetic */ Integer y(i iVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return iVar.x(z15);
    }

    private final dx.i<dx.b, CertKeyPair> z(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    DocumentCertsSet documentCertsSet = (DocumentCertsSet) new ex.a().a(vi2.a.INSTANCE.a(this.pkcs12Manager).m(bundleId));
                    return new dx.i.Right(new CertKeyPair(documentCertsSet.getUserCert(), documentCertsSet.getUserPrivateKey()));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public final String F(String data) {
        Object objB;
        dx.i iVarA = iy.l.a(this.digest, data.getBytes(StandardCharsets.UTF_8), null, 2, null);
        if (iVarA instanceof dx.i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarA instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVarA).b();
        }
        return iy.a.e(this.base64Coder, (byte[]) objB, null, 2, null);
    }

    @Override // g34.c
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public a0<i0> n() {
        return this.mainIdentityCertificateChanged;
    }

    @Override // g34.c
    public Object a(tq.e<? super i0> eVar) {
        Object objG = ju.i.g(g1.b(), new c(null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    @Override // g34.c
    public dx.i<dx.b, Boolean> c() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    boolean z15 = true;
                    if (y(this, false, 1, null) == null) {
                        if (x(false) != null) {
                            aVar.b(new dx.b.Deactivate(new IdentityDeactivateData((u) aVar.a(g(false)), false, false)));
                            throw new oq.g();
                        }
                        z15 = false;
                    }
                    return new dx.i.Right(Boolean.valueOf(z15));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0116 A[Catch: Exception -> 0x01e4, c -> 0x01e6, CancellationException -> 0x01ea, TryCatch #5 {c -> 0x01e6, CancellationException -> 0x01ea, Exception -> 0x01e4, blocks: (B:59:0x01f6, B:29:0x0110, B:31:0x0116, B:38:0x0135, B:35:0x0129, B:61:0x01fe), top: B:83:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0120  */
    /* JADX WARN: Code duplicated, block: B:35:0x0129 A[Catch: Exception -> 0x01e4, c -> 0x01e6, CancellationException -> 0x01ea, TryCatch #5 {c -> 0x01e6, CancellationException -> 0x01ea, Exception -> 0x01e4, blocks: (B:59:0x01f6, B:29:0x0110, B:31:0x0116, B:38:0x0135, B:35:0x0129, B:61:0x01fe), top: B:83:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0135 A[Catch: Exception -> 0x01e4, c -> 0x01e6, CancellationException -> 0x01ea, TRY_LEAVE, TryCatch #5 {c -> 0x01e6, CancellationException -> 0x01ea, Exception -> 0x01e4, blocks: (B:59:0x01f6, B:29:0x0110, B:31:0x0116, B:38:0x0135, B:35:0x0129, B:61:0x01fe), top: B:83:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x019a  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x0089: MOVE (r7 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]), block:B:15:0x0089 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x019a -> B:42:0x01b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01ee -> B:58:0x01f4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // g34.c
    public java.lang.Object d(tq.e<? super dx.i<? extends dx.b, ? extends java.util.Map<rq0.b, java.lang.String>>> r26) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.feature.legacy.storage.i.d(tq.e):java.lang.Object");
    }

    @Override // g34.c
    public Object e(u uVar, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new dx.i.Right((String) aVar.a(D(((Number) aVar.a(w(uVar))).intValue())));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // g34.c
    public Object f(rq0.b bVar, tq.e<? super rq0.b> eVar) {
        cj2.a aVarL;
        cj2.b bVarA = A().a();
        aj2.a aVarG = (bVarA == null || (aVarL = bVarA.l(n.a(bVar))) == null) ? null : aVarL.g();
        rq0.a aVarB = aVarG != null ? this.serviceToContainerIdMapper.b(aVarG) : null;
        if (aVarB instanceof rq0.b) {
            return (rq0.b) aVarB;
        }
        return null;
    }

    @Override // g34.c
    public dx.i<dx.b, u> g(boolean withValidCert) {
        Object objB;
        u uVar;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    r<aj2.a, Integer> rVarA = E(withValidCert).a();
                    aj2.a aVarC = rVarA != null ? rVarA.c() : null;
                    int i15 = aVarC == null ? -1 : a.f158784b[aVarC.ordinal()];
                    if (i15 == 1) {
                        uVar = u.MOBYWATEL;
                    } else if (i15 == 2) {
                        uVar = u.DIIA;
                    } else {
                        if (i15 != 3) {
                            u uVar2 = u.MOBYWATEL;
                            dx.i<dx.b, Boolean> iVarC = c();
                            if (iVarC instanceof dx.i.Left) {
                                aVar.b((dx.b) ((dx.i.Left) iVarC).b());
                                throw new oq.g();
                            }
                            if (!(iVarC instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            aVar.b(new dx.b.Deactivate(new IdentityDeactivateData(uVar2, true, ((Boolean) ((dx.i.Right) iVarC).b()).booleanValue())));
                            throw new oq.g();
                        }
                        uVar = u.STUDENT;
                    }
                    return new dx.i.Right(uVar);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // g34.c
    public rq0.b h(boolean withValidCert) {
        r<aj2.a, Integer> rVarA = E(withValidCert).a();
        aj2.a aVarC = rVarA != null ? rVarA.c() : null;
        int i15 = aVarC == null ? -1 : a.f158784b[aVarC.ordinal()];
        if (i15 == 1) {
            return rq0.b.d.ID_CARD;
        }
        if (i15 == 2) {
            return rq0.b.d.DIIA_REFUGEE_CARD;
        }
        if (i15 != 3) {
            return null;
        }
        return rq0.b.d.STUDENT_CARD;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x02c0 A[Catch: Exception -> 0x02c7, c -> 0x02cb, CancellationException -> 0x02cf, TryCatch #10 {c -> 0x02cb, CancellationException -> 0x02cf, Exception -> 0x02c7, blocks: (B:62:0x02b2, B:64:0x02c0, B:72:0x02d4), top: B:101:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0383  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:87:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x03d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0, types: [pl.gov.coi.mobywatel.feature.legacy.storage.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v43 */
    @Override // g34.c
    public Object i(rq0.b bVar, b0 b0Var, iy.a0 a0Var, b0 b0Var2, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        d dVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        int iIntValue;
        x xVar;
        b0 b0Var3;
        iy.a0 a0Var2;
        b0 b0Var4;
        ex.b bVar2;
        ex.b bVar3;
        aj2.a aVar;
        Object obj;
        x xVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar4;
        char[] cArr;
        x xVar3;
        dx.j<dx.b> jVar;
        iy.a0 a0Var3;
        byte[] bArr;
        int i25;
        aj2.a aVar2;
        rq0.b bVar5;
        Object obj2;
        int i26;
        ex.b bVar6;
        ?? r15;
        iy.a0 a0Var4;
        byte[] data;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i27 = dVar.D;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.D = i27 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj3 = dVar.B;
        ?? E = uq.b.e();
        int i28 = dVar.D;
        try {
            try {
                if (i28 == 0) {
                    oq.u.b(obj3);
                    jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        aj2.a aVarA = n.a(bVar);
                        iIntValue = ((Number) aVar3.a(v(bVar))).intValue();
                        if (iIntValue != -1) {
                            xVar = new x(vq.b.e(iIntValue), (bj2.c) aVar3.a(C(iIntValue)), (bj2.b) aVar3.a(B(iIntValue)));
                        } else {
                            cj2.a aVar4 = new cj2.a();
                            aVar4.r(aVarA);
                            aVar4.q(aVarA.getId());
                            int iIntValue2 = ((Number) aVar3.a(G(aVar4))).intValue();
                            bj2.c cVar = new bj2.c();
                            cVar.d(iIntValue2);
                            cVar.e(pl.gov.coi.mobywatel.feature.legacy.storage.d.USER);
                            cVar.c();
                            bj2.b bVar7 = new bj2.b();
                            bVar7.d(iIntValue2);
                            bVar7.e(pl.gov.coi.mobywatel.feature.legacy.storage.d.PASS);
                            bVar7.c();
                            xVar = new x(vq.b.e(iIntValue2), cVar, bVar7);
                        }
                        dVar.f158812d = vq.j.a(bVar);
                        b0Var3 = b0Var;
                        dVar.f158813e = b0Var3;
                        a0Var2 = a0Var;
                        dVar.f158814f = a0Var2;
                        b0Var4 = b0Var2;
                        dVar.f158815g = b0Var4;
                        dVar.f158816h = jVarA;
                        dVar.f158817j = vq.j.a(aVar3);
                        dVar.f158818k = aVar3;
                        dVar.f158819l = vq.j.a(aVarA);
                        dVar.f158820m = xVar;
                        dVar.f158826t = 0;
                        dVar.f158827v = 0;
                        dVar.f158828w = 0;
                        dVar.f158829x = 0;
                        dVar.f158830y = 0;
                        dVar.f158831z = iIntValue;
                        dVar.D = 1;
                        Object objA = this.bytesGenerator.a(new byte[0], 16, dVar);
                        if (objA == E) {
                            return E;
                        }
                        bVar2 = aVar3;
                        bVar3 = bVar2;
                        aVar = aVarA;
                        obj = objA;
                        xVar2 = xVar;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            if (i28 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            try {
                                oq.u.b(obj3);
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            }
                        }
                        int i29 = dVar.f158831z;
                        int i35 = dVar.f158830y;
                        int i36 = dVar.f158829x;
                        int i37 = dVar.f158828w;
                        int i38 = dVar.f158827v;
                        int i39 = dVar.f158826t;
                        x xVar4 = (x) dVar.f158822p;
                        char[] cArr2 = (char[]) dVar.f158821n;
                        byte[] bArr2 = (byte[]) dVar.f158820m;
                        aj2.a aVar5 = (aj2.a) dVar.f158819l;
                        ex.b bVar8 = (ex.b) dVar.f158818k;
                        ex.b bVar9 = (ex.b) dVar.f158817j;
                        dx.j<dx.b> jVar2 = (dx.j) dVar.f158816h;
                        b0 b0Var5 = (b0) dVar.f158815g;
                        iy.a0 a0Var5 = (iy.a0) dVar.f158814f;
                        b0 b0Var6 = (b0) dVar.f158813e;
                        rq0.b bVar10 = (rq0.b) dVar.f158812d;
                        try {
                            oq.u.b(obj3);
                            b0Var4 = b0Var5;
                            obj2 = obj3;
                            xVar3 = xVar4;
                            cArr = cArr2;
                            i18 = i37;
                            bVar6 = bVar9;
                            i25 = i35;
                            aVar2 = aVar5;
                            jVar = jVar2;
                            bVar4 = bVar8;
                            iIntValue = i29;
                            a0Var3 = a0Var5;
                            bVar5 = bVar10;
                            i15 = i39;
                            r15 = E;
                            bArr = bArr2;
                            i19 = i38;
                            i26 = i36;
                            b0Var3 = b0Var6;
                            try {
                                a0Var4 = (iy.a0) ((dx.i) obj2).a();
                                iy.a0 a0Var6 = a0Var3;
                                if (a0Var4 != null) {
                                    data = a0Var4.getData();
                                } else {
                                    data = null;
                                }
                                aj2.a aVar6 = aVar2;
                                int iIntValue3 = ((Number) xVar3.d()).intValue();
                                b0 b0Var7 = b0Var3;
                                bj2.c cVar2 = (bj2.c) xVar3.e();
                                ex.b bVar11 = bVar6;
                                bj2.b bVar12 = (bj2.b) xVar3.f();
                                cVar2.X(c0.e(b0Var7));
                                r(cVar2, bVar12, data, bArr);
                                J(this, iIntValue3, false, 2, null);
                                vi2.a.INSTANCE.a(this.pkcs12Manager).f();
                                cVar2.c();
                                bVar12.c();
                                dVar.f158812d = vq.j.a(bVar5);
                                dVar.f158813e = vq.j.a(b0Var7);
                                dVar.f158814f = vq.j.a(a0Var6);
                                dVar.f158815g = vq.j.a(b0Var4);
                                dVar.f158816h = jVar;
                                dVar.f158817j = vq.j.a(bVar11);
                                dVar.f158818k = vq.j.a(bVar4);
                                dVar.f158819l = vq.j.a(aVar6);
                                dVar.f158820m = vq.j.a(bArr);
                                dVar.f158821n = vq.j.a(cArr);
                                dVar.f158822p = vq.j.a(data);
                                dVar.f158823q = vq.j.a(cVar2);
                                dVar.f158824r = vq.j.a(bVar12);
                                dVar.f158825s = vq.j.a(xVar3);
                                dVar.f158826t = i15;
                                dVar.f158827v = i19;
                                dVar.f158828w = i18;
                                dVar.f158829x = i26;
                                dVar.f158830y = i25;
                                dVar.f158831z = iIntValue;
                                dVar.A = iIntValue3;
                                dVar.D = 3;
                                if (a(dVar) == r15) {
                                    return r15;
                                }
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e25) {
                                e = e25;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e26) {
                                throw e26;
                            } catch (Exception e27) {
                                e = e27;
                                E = jVar;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } catch (ex.c e28) {
                            e = e28;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e29) {
                            throw e29;
                        } catch (Exception e35) {
                            e = e35;
                            E = jVar2;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    obj = obj3;
                    int i45 = dVar.f158831z;
                    int i46 = dVar.f158830y;
                    int i47 = dVar.f158829x;
                    int i48 = dVar.f158828w;
                    int i49 = dVar.f158827v;
                    int i55 = dVar.f158826t;
                    x xVar5 = (x) dVar.f158820m;
                    aj2.a aVar7 = (aj2.a) dVar.f158819l;
                    bVar3 = (ex.b) dVar.f158818k;
                    ex.b bVar13 = (ex.b) dVar.f158817j;
                    dx.j<dx.b> jVar3 = (dx.j) dVar.f158816h;
                    b0 b0Var8 = (b0) dVar.f158815g;
                    iy.a0 a0Var7 = (iy.a0) dVar.f158814f;
                    b0 b0Var9 = (b0) dVar.f158813e;
                    rq0.b bVar14 = (rq0.b) dVar.f158812d;
                    try {
                        oq.u.b(obj);
                        i16 = i46;
                        jVarA = jVar3;
                        b0Var4 = b0Var8;
                        i18 = i48;
                        aVar = aVar7;
                        bVar2 = bVar13;
                        a0Var2 = a0Var7;
                        i17 = i47;
                        i19 = i49;
                        xVar2 = xVar5;
                        iIntValue = i45;
                        b0Var3 = b0Var9;
                        bVar = bVar14;
                        i15 = i55;
                    } catch (ex.c e36) {
                        e = e36;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e37) {
                        throw e37;
                    } catch (Exception e38) {
                        e = e38;
                        E = jVar3;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                byte[] bArr3 = (byte[]) obj;
                iy.a0 a0Var8 = a0Var2;
                char[] cArr3 = (char[]) bVar3.a(this.bytesConverter.c(bArr3, iy.b.a.f97723a));
                v vVar = this.pkcs12Manager;
                bVar4 = bVar3;
                b0 b0Var10 = new b0(cArr3);
                cArr = cArr3;
                dVar.f158812d = vq.j.a(bVar);
                dVar.f158813e = b0Var3;
                dVar.f158814f = vq.j.a(a0Var8);
                dVar.f158815g = vq.j.a(b0Var4);
                dVar.f158816h = jVarA;
                dVar.f158817j = vq.j.a(bVar2);
                dVar.f158818k = vq.j.a(bVar4);
                dVar.f158819l = vq.j.a(aVar);
                dVar.f158820m = bArr3;
                dVar.f158821n = vq.j.a(cArr);
                dVar.f158822p = xVar2;
                dVar.f158826t = i15;
                dVar.f158827v = i19;
                dVar.f158828w = i18;
                dVar.f158829x = i17;
                dVar.f158830y = i16;
                dVar.f158831z = iIntValue;
                dVar.D = 2;
                Object objB2 = vVar.b(a0Var8, b0Var4, b0Var10, dVar);
                ?? r16 = E;
                if (objB2 == r16) {
                    return r16;
                }
                xVar3 = xVar2;
                jVar = jVarA;
                a0Var3 = a0Var8;
                bArr = bArr3;
                i25 = i16;
                aVar2 = aVar;
                bVar5 = bVar;
                obj2 = objB2;
                i26 = i17;
                bVar6 = bVar2;
                r15 = r16;
                a0Var4 = (iy.a0) ((dx.i) obj2).a();
                iy.a0 a0Var9 = a0Var3;
                if (a0Var4 != null) {
                    data = a0Var4.getData();
                } else {
                    data = null;
                }
                aj2.a aVar8 = aVar2;
                int iIntValue4 = ((Number) xVar3.d()).intValue();
                b0 b0Var11 = b0Var3;
                bj2.c cVar3 = (bj2.c) xVar3.e();
                ex.b bVar15 = bVar6;
                bj2.b bVar16 = (bj2.b) xVar3.f();
                cVar3.X(c0.e(b0Var11));
                r(cVar3, bVar16, data, bArr);
                J(this, iIntValue4, false, 2, null);
                vi2.a.INSTANCE.a(this.pkcs12Manager).f();
                cVar3.c();
                bVar16.c();
                dVar.f158812d = vq.j.a(bVar5);
                dVar.f158813e = vq.j.a(b0Var11);
                dVar.f158814f = vq.j.a(a0Var9);
                dVar.f158815g = vq.j.a(b0Var4);
                dVar.f158816h = jVar;
                dVar.f158817j = vq.j.a(bVar15);
                dVar.f158818k = vq.j.a(bVar4);
                dVar.f158819l = vq.j.a(aVar8);
                dVar.f158820m = vq.j.a(bArr);
                dVar.f158821n = vq.j.a(cArr);
                dVar.f158822p = vq.j.a(data);
                dVar.f158823q = vq.j.a(cVar3);
                dVar.f158824r = vq.j.a(bVar16);
                dVar.f158825s = vq.j.a(xVar3);
                dVar.f158826t = i15;
                dVar.f158827v = i19;
                dVar.f158828w = i18;
                dVar.f158829x = i26;
                dVar.f158830y = i25;
                dVar.f158831z = iIntValue;
                dVar.A = iIntValue4;
                dVar.D = 3;
                if (a(dVar) == r15) {
                    return r15;
                }
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e39) {
                e = e39;
            }
        } catch (CancellationException e45) {
            throw e45;
        }
    }

    @Override // g34.c
    public Object j(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
        Object objB;
        Object next;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    Iterator it = ((Iterable) aVar.a(s())).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((cj2.a) next).i() != n.a(bVar));
                    cj2.a aVar2 = (cj2.a) next;
                    boolean zA = false;
                    if (aVar2 != null) {
                        if (!bVar.e()) {
                            zA = lj2.a.a(((Number) aVar.a(u(aVar2.g()))).intValue());
                        } else if (!aVar2.k()) {
                            zA = true;
                        }
                    }
                    return new dx.i.Right(vq.b.a(zA));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // g34.c
    public Object k(tq.e<? super i0> eVar) {
        Integer numY = y(this, false, 1, null);
        if (numY != null) {
            I(numY.intValue(), true);
            Object objA = a(eVar);
            if (objA == uq.b.e()) {
                return objA;
            }
        }
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d A[Catch: Exception -> 0x002c, c -> 0x002f, CancellationException -> 0x0031, TRY_ENTER, TryCatch #3 {Exception -> 0x002c, blocks: (B:3:0x0006, B:7:0x0028, B:27:0x004d, B:28:0x0054, B:29:0x007c, B:31:0x007f, B:32:0x0082, B:33:0x0083, B:36:0x0092), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[Catch: Exception -> 0x002c, c -> 0x002f, CancellationException -> 0x0031, TryCatch #3 {Exception -> 0x002c, blocks: (B:3:0x0006, B:7:0x0028, B:27:0x004d, B:28:0x0054, B:29:0x007c, B:31:0x007f, B:32:0x0082, B:33:0x0083, B:36:0x0092), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[Catch: Exception -> 0x002c, c -> 0x002f, CancellationException -> 0x0031, TryCatch #3 {Exception -> 0x002c, blocks: (B:3:0x0006, B:7:0x0028, B:27:0x004d, B:28:0x0054, B:29:0x007c, B:31:0x007f, B:32:0x0082, B:33:0x0083, B:36:0x0092), top: B:54:0x0006 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0054, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [bj2.c] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [bj2.c] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r7v0, types: [pl.gov.coi.mobywatel.feature.legacy.storage.i] */
    @Override // g34.c
    public Object l(u uVar, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        Object objB;
        bj2.c cVar;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    ?? IntValue = ((Number) aVar.a(w(uVar))).intValue();
                    ?? r15 = 0;
                    strB = null;
                    String strB = null;
                    try {
                        try {
                            cVar = (bj2.c) aVar.a(C(IntValue));
                            try {
                                strB = cVar.B();
                                IntValue = cVar;
                            } catch (Exception e15) {
                                e = e15;
                                px.f.f163100a.d("Utils legacy error: getTicket() load userContainer", e, new ArrayList());
                                IntValue = cVar;
                                if (cVar != null) {
                                }
                                if (strB != null) {
                                    return new dx.i.Right(strB);
                                }
                                aVar.b(new dx.b.Generic(new NullPointerException("IdentityManager error, " + uVar + " has no ticket")));
                                throw new oq.g();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r15 = IntValue;
                            if (r15 != 0) {
                                r15.f();
                            }
                            throw th;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        cVar = null;
                    } catch (Throwable th5) {
                        th = th5;
                        if (r15 != 0) {
                            r15.f();
                        }
                        throw th;
                    }
                    IntValue.f();
                    if (strB != null) {
                        return new dx.i.Right(strB);
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("IdentityManager error, " + uVar + " has no ticket")));
                    throw new oq.g();
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (ex.c e18) {
                return new dx.i.Left((dx.b) ex.d.a(e18));
            } catch (CancellationException e19) {
                throw e19;
            }
        } catch (Exception e25) {
            px.f fVar = px.f.f163100a;
            String message = e25.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e25, px.c.a(jVarA));
            Object objA = jVarA.a(e25);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // g34.c
    public dx.i<dx.b, CertKeyPair> m(u identityType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return z(((Number) new ex.a().a(w(identityType))).intValue());
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // g34.c
    public Object p(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    u uVarK = K(bVar);
                    if (uVarK != null) {
                        return new dx.i.Right(((CertKeyPair) aVar.a(m(uVarK))).getCertificate().getSerialNumber().toString(16));
                    }
                    aVar.b(new dx.b.Generic(new Exception("Error identityType: Cannot map documentType to identityType")));
                    throw new oq.g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
