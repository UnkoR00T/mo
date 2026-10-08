package pc4;

import d64.DrivingLicencesExpirationDate;
import f24.Document;
import i24.DrivingLicenceData;
import i24.DrivingLicenceFullData;
import i24.DynamicDocumentData;
import i24.FamilyCardData;
import i24.FamilyCardFullData;
import i24.MIdCardData;
import i24.RailwayCardData;
import i24.RailwayCardFullData;
import i24.StudentCardData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jr0.DrivingLicenceDataContainer;
import jr0.DrivingLicenceScope;
import jr0.PersonalDataScope9;
import k34.DrivingLicenceScopes;
import k34.FamilyCardDataModel;
import k34.FamilyDataModel;
import k34.RailwayCardDataModel;
import k34.RailwayCardDocumentData;
import k34.StudentCardDocumentData;
import l34.DynamicDocumentDataContainer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009f\u0001\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lpc4/r5;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/e;", "getMIdCardDataUC", "Lq34/w0;", "getMIdCardDataUseCase", "Lq34/d1;", "getUutCardDataUC", "Lw24/j1;", "getRailwayCardDataUC", "Lq34/s0;", "getFamilyCardDataUC", "Lw24/s0;", "containersGetFamilyCardDataUC", "Lq34/c1;", "getStudentCardDocumentsUseCase", "Lk24/h;", "getStudentCardDataUC", "Lez/c;", "dateConverter", "Lq34/v0;", "getLinkedDocumentsUseCase", "Lw24/v;", "getAllDocumentsWithCertificateIdUC", "Lw24/m0;", "getDrivingLicenceDataUC", "Lq34/m0;", "getDrivingLicenceDocumentsFromContainerUseCase", "Lq34/e1;", "getVehiclesDataUseCase", "Lw24/q1;", "getVehiclesDataUC", "Lw24/o0;", "getDynamicDocumentDataByTypeUC", "Lq34/n0;", "getDynamicDocumentFromContainerUseCase", "Lc64/a;", "a", "(Lc54/b;Lk24/e;Lq34/w0;Lq34/d1;Lw24/j1;Lq34/s0;Lw24/s0;Lq34/c1;Lk24/h;Lez/c;Lq34/v0;Lw24/v;Lw24/m0;Lq34/m0;Lq34/e1;Lw24/q1;Lw24/o0;Lq34/n0;)Lc64/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r5 f155705a = new r5();

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\u0006J\u001e\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\b\u0010\u0006J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\t\u0010\u0006J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002H\u0096@¢\u0006\u0004\b\u000b\u0010\u0006J&\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0002H\u0096@¢\u0006\u0004\b\u0012\u0010\u0006J*\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u00022\u0006\u0010\r\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u0002H\u0096@¢\u0006\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"pc4/r5$a", "Lc64/a;", "Ldx/i;", "Ldx/b;", "Lfz/b$c;", "d", "(Ltq/e;)Ljava/lang/Object;", "e", "c", "i", "Ld64/a;", "a", "Lrq0/b$b;", "documentType", "f", "(Lrq0/b$b;Ltq/e;)Ljava/lang/Object;", "", "", "h", "Lrq0/b;", "b", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Ld64/b;", "g", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements c64.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.e f155707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.w0 f155708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.j1 f155709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.d1 f155710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ez.c f155711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w24.s0 f155712g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q34.s0 f155713h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ k24.h f155714i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.c1 f155715j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.m0 f155716k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.m0 f155717l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ w24.o0 f155718m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ q34.n0 f155719n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ w24.v f155720o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q34.v0 f155721p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ w24.q1 f155722q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ q34.e1 f155723r;

        /* JADX INFO: renamed from: pc4.r5$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3861a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155724d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155725e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155726f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155727g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155728h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155729j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155730k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155731l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155732m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155733n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155734p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155736r;

            C3861a(tq.e<? super C3861a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155734p = obj;
                this.f155736r |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155737d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155738e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155739f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155740g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155741h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155742j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155743k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155744l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155745m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155746n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155748q;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155746n = obj;
                this.f155748q |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155749d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155750e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155751f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155752g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155753h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155754j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155755k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155756l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155757m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155758n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155759p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155761r;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155759p = obj;
                this.f155761r |= PKIFailureInfo.systemUnavail;
                return a.this.f(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155762d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155763e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155764f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155765g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155766h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155767j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155768k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155769l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155770m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f155771n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155772p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155774r;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155772p = obj;
                this.f155774r |= PKIFailureInfo.systemUnavail;
                return a.this.c(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155775d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155776e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155777f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155778g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155779h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155780j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155781k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155782l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155783m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155784n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155786q;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155784n = obj;
                this.f155786q |= PKIFailureInfo.systemUnavail;
                return a.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155787d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155788e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155789f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155790g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155791h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155792j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155793k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155794l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155795m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f155796n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155797p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155799r;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155797p = obj;
                this.f155799r |= PKIFailureInfo.systemUnavail;
                return a.this.i(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class g extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155800d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155801e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155802f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155803g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155804h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155805j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155806k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155807l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155808m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155809n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155811q;

            g(tq.e<? super g> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155809n = obj;
                this.f155811q |= PKIFailureInfo.systemUnavail;
                return a.this.h(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class h extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155812d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155813e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155814f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155815g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155816h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155817j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155818k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155819l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155820m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f155821n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155822p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155824r;

            h(tq.e<? super h> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155822p = obj;
                this.f155824r |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class i extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155825d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155827f;

            i(tq.e<? super i> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155825d = obj;
                this.f155827f |= PKIFailureInfo.systemUnavail;
                return a.this.g(this);
            }
        }

        a(c54.b bVar, k24.e eVar, q34.w0 w0Var, w24.j1 j1Var, q34.d1 d1Var, ez.c cVar, w24.s0 s0Var, q34.s0 s0Var2, k24.h hVar, q34.c1 c1Var, w24.m0 m0Var, q34.m0 m0Var2, w24.o0 o0Var, q34.n0 n0Var, w24.v vVar, q34.v0 v0Var, w24.q1 q1Var, q34.e1 e1Var) {
            this.f155706a = bVar;
            this.f155707b = eVar;
            this.f155708c = w0Var;
            this.f155709d = j1Var;
            this.f155710e = d1Var;
            this.f155711f = cVar;
            this.f155712g = s0Var;
            this.f155713h = s0Var2;
            this.f155714i = hVar;
            this.f155715j = c1Var;
            this.f155716k = m0Var;
            this.f155717l = m0Var2;
            this.f155718m = o0Var;
            this.f155719n = n0Var;
            this.f155720o = vVar;
            this.f155721p = v0Var;
            this.f155722q = q1Var;
            this.f155723r = e1Var;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:64:0x0134  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.r5$a$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // c64.a
        public Object a(tq.e<? super dx.i<? extends dx.b, DrivingLicencesExpirationDate>> eVar) throws Throwable {
            ?? bVar;
            Object objB;
            ex.b bVar2;
            ex.b bVar3;
            DrivingLicencesExpirationDate drivingLicencesExpirationDate;
            DrivingLicenceData drivingLicenceDataE;
            fz.b.LocalDate expirationDate;
            DrivingLicenceData drivingLicenceDataC;
            Document document;
            Document document2;
            DrivingLicenceScope drivingLicence;
            fz.b.LocalDate localDate;
            DrivingLicenceScope activeTemporaryDrivingLicence;
            DrivingLicenceDataContainer drivingLicenceDataContainer;
            LocalDate expiredDate;
            DrivingLicenceDataContainer drivingLicenceDataContainer2;
            LocalDate expiredDate2;
            if (eVar instanceof b) {
                b bVar4 = (b) eVar;
                int i15 = bVar4.f155748q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar4.f155748q = i15 - PKIFailureInfo.systemUnavail;
                    bVar = bVar4;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f155746n;
            Object objE = uq.b.e();
            int i16 = bVar.f155748q;
            fz.b.LocalDate expirationDate2 = null;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar5 = this.f155706a;
                            w24.m0 m0Var = this.f155716k;
                            q34.m0 m0Var2 = this.f155717l;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar5.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    bVar.f155742j = jVarA;
                                    bVar.f155743k = vq.j.a(aVar);
                                    bVar.f155744l = vq.j.a(aVar);
                                    bVar.f155745m = aVar;
                                    bVar.f155737d = 0;
                                    bVar.f155738e = 0;
                                    bVar.f155739f = 0;
                                    bVar.f155740g = 0;
                                    bVar.f155741h = 0;
                                    bVar.f155748q = 1;
                                    objC = m0Var.c(c1792a, bVar);
                                    if (objC != objE) {
                                        bVar3 = aVar;
                                        DrivingLicenceFullData drivingLicenceFullData = (DrivingLicenceFullData) bVar3.a((dx.i) objC);
                                        drivingLicenceDataE = drivingLicenceFullData.e();
                                        if (drivingLicenceDataE != null) {
                                            expirationDate = null;
                                        } else {
                                            expirationDate = null;
                                        }
                                        drivingLicenceDataC = drivingLicenceFullData.c();
                                        if (drivingLicenceDataC != null) {
                                            expirationDate2 = document.getExpirationDate();
                                        }
                                        drivingLicencesExpirationDate = new DrivingLicencesExpirationDate(expirationDate, expirationDate2);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    bVar.f155742j = jVarA;
                                    bVar.f155743k = vq.j.a(aVar);
                                    bVar.f155744l = vq.j.a(aVar);
                                    bVar.f155745m = aVar;
                                    bVar.f155737d = 0;
                                    bVar.f155738e = 0;
                                    bVar.f155739f = 0;
                                    bVar.f155740g = 0;
                                    bVar.f155741h = 0;
                                    bVar.f155748q = 2;
                                    objC = m0Var2.c(c1792a2, bVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        DrivingLicenceScopes drivingLicenceScopes = (DrivingLicenceScopes) bVar2.a((dx.i) objC);
                                        drivingLicence = drivingLicenceScopes.getDrivingLicence();
                                        if (drivingLicence != null) {
                                            localDate = null;
                                        } else {
                                            localDate = null;
                                        }
                                        activeTemporaryDrivingLicence = drivingLicenceScopes.getActiveTemporaryDrivingLicence();
                                        if (activeTemporaryDrivingLicence != null) {
                                            expirationDate2 = new fz.b.LocalDate(expiredDate);
                                        }
                                        drivingLicencesExpirationDate = new DrivingLicencesExpirationDate(localDate, expirationDate2);
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                bVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(bVar));
                                dx.i iVarA = bVar.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            bVar3 = (ex.b) bVar.f155745m;
                            oq.u.b(objC);
                            DrivingLicenceFullData drivingLicenceFullData2 = (DrivingLicenceFullData) bVar3.a((dx.i) objC);
                            drivingLicenceDataE = drivingLicenceFullData2.e();
                            if (drivingLicenceDataE != null || (document2 = drivingLicenceDataE.getDocument()) == null) {
                                expirationDate = null;
                            } else {
                                expirationDate = document2.getExpirationDate();
                            }
                            drivingLicenceDataC = drivingLicenceFullData2.c();
                            if (drivingLicenceDataC != null && (document = drivingLicenceDataC.getDocument()) != null) {
                                expirationDate2 = document.getExpirationDate();
                            }
                            drivingLicencesExpirationDate = new DrivingLicencesExpirationDate(expirationDate, expirationDate2);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar2 = (ex.b) bVar.f155745m;
                            oq.u.b(objC);
                            DrivingLicenceScopes drivingLicenceScopes2 = (DrivingLicenceScopes) bVar2.a((dx.i) objC);
                            drivingLicence = drivingLicenceScopes2.getDrivingLicence();
                            if (drivingLicence != null || (drivingLicenceDataContainer2 = drivingLicence.getDrivingLicenceDataContainer()) == null || (expiredDate2 = drivingLicenceDataContainer2.getExpiredDate()) == null) {
                                localDate = null;
                            } else {
                                localDate = new fz.b.LocalDate(expiredDate2);
                            }
                            activeTemporaryDrivingLicence = drivingLicenceScopes2.getActiveTemporaryDrivingLicence();
                            if (activeTemporaryDrivingLicence != null && (drivingLicenceDataContainer = activeTemporaryDrivingLicence.getDrivingLicenceDataContainer()) != null && (expiredDate = drivingLicenceDataContainer.getExpiredDate()) != null) {
                                expirationDate2 = new fz.b.LocalDate(expiredDate);
                            }
                            drivingLicencesExpirationDate = new DrivingLicencesExpirationDate(localDate, expirationDate2);
                        }
                        return new dx.i.Right(drivingLicencesExpirationDate);
                    } catch (Exception e18) {
                        e = e18;
                    }
                } catch (CancellationException e19) {
                    throw e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[Catch: Exception -> 0x0067, c -> 0x006b, CancellationException -> 0x006f, TryCatch #7 {c -> 0x006b, CancellationException -> 0x006f, Exception -> 0x0067, blocks: (B:65:0x0165, B:24:0x0062, B:39:0x00db, B:49:0x011c, B:42:0x00e2, B:44:0x00e6, B:45:0x00ff, B:47:0x0105, B:48:0x0117, B:50:0x0123, B:51:0x0128), top: B:89:0x0062 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[Catch: Exception -> 0x0067, c -> 0x006b, CancellationException -> 0x006f, TryCatch #7 {c -> 0x006b, CancellationException -> 0x006f, Exception -> 0x0067, blocks: (B:65:0x0165, B:24:0x0062, B:39:0x00db, B:49:0x011c, B:42:0x00e2, B:44:0x00e6, B:45:0x00ff, B:47:0x0105, B:48:0x0117, B:50:0x0123, B:51:0x0128), top: B:89:0x0062 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0105 A[Catch: Exception -> 0x0067, c -> 0x006b, CancellationException -> 0x006f, LOOP:0: B:45:0x00ff->B:47:0x0105, LOOP_END, TryCatch #7 {c -> 0x006b, CancellationException -> 0x006f, Exception -> 0x0067, blocks: (B:65:0x0165, B:24:0x0062, B:39:0x00db, B:49:0x011c, B:42:0x00e2, B:44:0x00e6, B:45:0x00ff, B:47:0x0105, B:48:0x0117, B:50:0x0123, B:51:0x0128), top: B:89:0x0062 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0123 A[Catch: Exception -> 0x0067, c -> 0x006b, CancellationException -> 0x006f, TryCatch #7 {c -> 0x006b, CancellationException -> 0x006f, Exception -> 0x0067, blocks: (B:65:0x0165, B:24:0x0062, B:39:0x00db, B:49:0x011c, B:42:0x00e2, B:44:0x00e6, B:45:0x00ff, B:47:0x0105, B:48:0x0117, B:50:0x0123, B:51:0x0128), top: B:89:0x0062 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x0189  */
        /* JADX WARN: Code duplicated, block: B:78:0x019a  */
        /* JADX WARN: Code duplicated, block: B:79:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:84:0x01b9  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v31 */
        @Override // c64.a
        public Object b(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends rq0.b>>> eVar) throws Throwable {
            C3861a c3861a;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            Object right;
            ArrayList arrayList;
            Iterator it;
            List list;
            if (eVar instanceof C3861a) {
                c3861a = (C3861a) eVar;
                int i15 = c3861a.f155736r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3861a.f155736r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3861a = new C3861a(eVar);
                }
            } else {
                c3861a = new C3861a(eVar);
            }
            Object objC = c3861a.f155734p;
            Object objE = uq.b.e();
            int i16 = c3861a.f155736r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f155706a;
                        w24.v vVar = this.f155720o;
                        q34.v0 v0Var = this.f155721p;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                w24.v.Params params = new w24.v.Params((f24.c) aVar.a(t24.a.a((f24.i) aVar.a(j1.l(bVar)))));
                                c3861a.f155724d = vq.j.a(bVar);
                                c3861a.f155725e = jVarA;
                                c3861a.f155726f = vq.j.a(aVar);
                                c3861a.f155727g = vq.j.a(aVar);
                                c3861a.f155728h = aVar;
                                c3861a.f155729j = 0;
                                c3861a.f155730k = 0;
                                c3861a.f155731l = 0;
                                c3861a.f155732m = 0;
                                c3861a.f155733n = 0;
                                c3861a.f155736r = 1;
                                objC = vVar.c(params, c3861a);
                                if (objC != objE) {
                                    bVar2 = aVar;
                                    right = (dx.i) objC;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (right instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        List list2 = (List) ((dx.i.Right) right).b();
                                        arrayList = new ArrayList(pq.v.y(list2, 10));
                                        it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(r2.a(((Document) it.next()).getDocumentType()));
                                        }
                                        right = new dx.i.Right(arrayList);
                                    }
                                    list = (List) bVar2.a(right);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.v0.Params params2 = new q34.v0.Params(bVar);
                                c3861a.f155724d = vq.j.a(bVar);
                                c3861a.f155725e = jVarA;
                                c3861a.f155726f = vq.j.a(aVar);
                                c3861a.f155727g = vq.j.a(aVar);
                                c3861a.f155729j = 0;
                                c3861a.f155730k = 0;
                                c3861a.f155731l = 0;
                                c3861a.f155732m = 0;
                                c3861a.f155733n = 0;
                                c3861a.f155736r = 2;
                                objC = v0Var.c(params2, c3861a);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    list = (List) objC;
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            bVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
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
                    if (i16 == 1) {
                        bVar2 = (ex.b) c3861a.f155728h;
                        dx.j jVar2 = (dx.j) c3861a.f155725e;
                        try {
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                List list3 = (List) ((dx.i.Right) right).b();
                                arrayList = new ArrayList(pq.v.y(list3, 10));
                                it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(r2.a(((Document) it.next()).getDocumentType()));
                                }
                                right = new dx.i.Right(arrayList);
                            }
                            list = (List) bVar2.a(right);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            bVar = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
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
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = (dx.j) c3861a.f155725e;
                        try {
                            oq.u.b(objC);
                            list = (List) objC;
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(list);
                } catch (Exception e28) {
                    e = e28;
                }
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x00e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:13:0x003d, B:57:0x0130, B:58:0x0142, B:60:0x0148, B:64:0x015b, B:66:0x015f, B:68:0x0165, B:70:0x016b, B:72:0x0173, B:73:0x0178, B:77:0x0184, B:80:0x0193, B:24:0x0064, B:33:0x00b5, B:34:0x00cb, B:36:0x00d1, B:40:0x00e8, B:42:0x00ec, B:44:0x00f2), top: B:95:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x0148 A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:13:0x003d, B:57:0x0130, B:58:0x0142, B:60:0x0148, B:64:0x015b, B:66:0x015f, B:68:0x0165, B:70:0x016b, B:72:0x0173, B:73:0x0178, B:77:0x0184, B:80:0x0193, B:24:0x0064, B:33:0x00b5, B:34:0x00cb, B:36:0x00d1, B:40:0x00e8, B:42:0x00ec, B:44:0x00f2), top: B:95:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:98:0x015a A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // c64.a
        public Object c(tq.e<? super dx.i<? extends dx.b, fz.b.LocalDate>> eVar) throws Throwable {
            d dVar;
            Object objB;
            ez.c cVar;
            ex.b bVar;
            ex.b bVar2;
            Iterator it;
            Object next;
            FamilyCardData familyCardData;
            Document document;
            Iterator it4;
            Object next2;
            FamilyDataModel familyDataModel;
            FamilyCardDataModel dataContainer;
            String ed5;
            LocalDate localDateO;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f155774r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f155774r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f155772p;
            Object objE = uq.b.e();
            ?? r15 = dVar.f155774r;
            fz.b.LocalDate expirationDate = null;
            try {
                try {
                    try {
                        if (r15 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f155706a;
                            w24.s0 s0Var = this.f155712g;
                            q34.s0 s0Var2 = this.f155713h;
                            ez.c cVar2 = this.f155711f;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    dVar.f155767j = jVarA;
                                    dVar.f155768k = vq.j.a(aVar);
                                    dVar.f155769l = vq.j.a(aVar);
                                    dVar.f155770m = aVar;
                                    dVar.f155762d = 0;
                                    dVar.f155763e = 0;
                                    dVar.f155764f = 0;
                                    dVar.f155765g = 0;
                                    dVar.f155766h = 0;
                                    dVar.f155774r = 1;
                                    objC = s0Var.c(c1792a, dVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        it = ((FamilyCardFullData) bVar2.a((dx.i) objC)).a().values().iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!((FamilyCardData) next).getScope().getData().j());
                                        familyCardData = (FamilyCardData) next;
                                        if (familyCardData != null) {
                                            expirationDate = document.getExpirationDate();
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    dVar.f155767j = cVar2;
                                    dVar.f155768k = jVarA;
                                    dVar.f155769l = vq.j.a(aVar);
                                    dVar.f155770m = vq.j.a(aVar);
                                    dVar.f155771n = aVar;
                                    dVar.f155762d = 0;
                                    dVar.f155763e = 0;
                                    dVar.f155764f = 0;
                                    dVar.f155765g = 0;
                                    dVar.f155766h = 0;
                                    dVar.f155774r = 2;
                                    objC = s0Var2.c(c1792a2, dVar);
                                    if (objC != objE) {
                                        cVar = cVar2;
                                        bVar = aVar;
                                        it4 = ((Map) bVar.a((dx.i) objC)).values().iterator();
                                        do {
                                            if (it4.hasNext()) {
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it4.next();
                                        } while (!((FamilyDataModel) next2).getDataContainer().j());
                                        familyDataModel = (FamilyDataModel) next2;
                                        if (familyDataModel != null) {
                                            expirationDate = new fz.b.LocalDate(localDateO);
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                dx.i iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 == 1) {
                            bVar2 = (ex.b) dVar.f155770m;
                            oq.u.b(objC);
                            it = ((FamilyCardFullData) bVar2.a((dx.i) objC)).a().values().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((FamilyCardData) next).getScope().getData().j());
                            familyCardData = (FamilyCardData) next;
                            if (familyCardData != null && (document = familyCardData.getDocument()) != null) {
                                expirationDate = document.getExpirationDate();
                            }
                        } else {
                            if (r15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) dVar.f155771n;
                            cVar = (ez.c) dVar.f155767j;
                            oq.u.b(objC);
                            it4 = ((Map) bVar.a((dx.i) objC)).values().iterator();
                            do {
                                if (it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                            } while (!((FamilyDataModel) next2).getDataContainer().j());
                            familyDataModel = (FamilyDataModel) next2;
                            if (familyDataModel != null && (dataContainer = familyDataModel.getDataContainer()) != null && (ed5 = dataContainer.getED()) != null && (localDateO = cVar.o(ed5, fz.c.BLANK_REVERSED)) != null) {
                                expirationDate = new fz.b.LocalDate(localDateO);
                            }
                        }
                        return new dx.i.Right(expirationDate);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.r5$a$e, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // c64.a
        public Object d(tq.e<? super dx.i<? extends dx.b, fz.b.LocalDate>> eVar) throws Throwable {
            ?? eVar2;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            fz.b.LocalDate expirationDate;
            if (eVar instanceof e) {
                e eVar3 = (e) eVar;
                int i15 = eVar3.f155786q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar3.f155786q = i15 - PKIFailureInfo.systemUnavail;
                    eVar2 = eVar3;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objC = eVar2.f155784n;
            Object objE = uq.b.e();
            int i16 = eVar2.f155786q;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f155706a;
                            k24.e eVar4 = this.f155707b;
                            q34.w0 w0Var = this.f155708c;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    eVar2.f155780j = jVarA;
                                    eVar2.f155781k = vq.j.a(aVar);
                                    eVar2.f155782l = vq.j.a(aVar);
                                    eVar2.f155783m = aVar;
                                    eVar2.f155775d = 0;
                                    eVar2.f155776e = 0;
                                    eVar2.f155777f = 0;
                                    eVar2.f155778g = 0;
                                    eVar2.f155779h = 0;
                                    eVar2.f155786q = 1;
                                    objC = eVar4.c(c1792a, eVar2);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        expirationDate = ((MIdCardData) bVar2.a((dx.i) objC)).getDocument().getExpirationDate();
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    eVar2.f155780j = jVarA;
                                    eVar2.f155781k = vq.j.a(aVar);
                                    eVar2.f155782l = vq.j.a(aVar);
                                    eVar2.f155783m = aVar;
                                    eVar2.f155775d = 0;
                                    eVar2.f155776e = 0;
                                    eVar2.f155777f = 0;
                                    eVar2.f155778g = 0;
                                    eVar2.f155779h = 0;
                                    eVar2.f155786q = 2;
                                    objC = w0Var.c(c1792a2, eVar2);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        expirationDate = new fz.b.LocalDate(((PersonalDataScope9) bVar.a((dx.i) objC)).getData().getMobileIdCard().getValidTo().toLocalDate());
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                eVar2 = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(eVar2));
                                dx.i iVarA = eVar2.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            bVar2 = (ex.b) eVar2.f155783m;
                            oq.u.b(objC);
                            expirationDate = ((MIdCardData) bVar2.a((dx.i) objC)).getDocument().getExpirationDate();
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) eVar2.f155783m;
                            oq.u.b(objC);
                            expirationDate = new fz.b.LocalDate(((PersonalDataScope9) bVar.a((dx.i) objC)).getData().getMobileIdCard().getValidTo().toLocalDate());
                        }
                        return new dx.i.Right(expirationDate);
                    } catch (Exception e18) {
                        e = e18;
                    }
                } catch (CancellationException e19) {
                    throw e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x00e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:13:0x003d, B:57:0x0130, B:58:0x0142, B:60:0x0148, B:64:0x015b, B:66:0x015f, B:68:0x0165, B:70:0x016b, B:72:0x0173, B:73:0x0178, B:77:0x0184, B:80:0x0193, B:24:0x0064, B:33:0x00b5, B:34:0x00cb, B:36:0x00d1, B:40:0x00e8, B:42:0x00ec, B:44:0x00f2), top: B:95:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x0148 A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:13:0x003d, B:57:0x0130, B:58:0x0142, B:60:0x0148, B:64:0x015b, B:66:0x015f, B:68:0x0165, B:70:0x016b, B:72:0x0173, B:73:0x0178, B:77:0x0184, B:80:0x0193, B:24:0x0064, B:33:0x00b5, B:34:0x00cb, B:36:0x00d1, B:40:0x00e8, B:42:0x00ec, B:44:0x00f2), top: B:95:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:98:0x015a A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // c64.a
        public Object e(tq.e<? super dx.i<? extends dx.b, fz.b.LocalDate>> eVar) throws Throwable {
            h hVar;
            Object objB;
            ez.c cVar;
            ex.b bVar;
            ex.b bVar2;
            Iterator it;
            Object next;
            RailwayCardData railwayCardData;
            Document document;
            Iterator it4;
            Object next2;
            RailwayCardDocumentData railwayCardDocumentData;
            RailwayCardDataModel dataContainer;
            String expiryDate;
            LocalDate localDateO;
            if (eVar instanceof h) {
                hVar = (h) eVar;
                int i15 = hVar.f155824r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    hVar.f155824r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    hVar = new h(eVar);
                }
            } else {
                hVar = new h(eVar);
            }
            Object objC = hVar.f155822p;
            Object objE = uq.b.e();
            ?? r15 = hVar.f155824r;
            fz.b.LocalDate expirationDate = null;
            try {
                try {
                    try {
                        if (r15 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f155706a;
                            w24.j1 j1Var = this.f155709d;
                            q34.d1 d1Var = this.f155710e;
                            ez.c cVar2 = this.f155711f;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    hVar.f155817j = jVarA;
                                    hVar.f155818k = vq.j.a(aVar);
                                    hVar.f155819l = vq.j.a(aVar);
                                    hVar.f155820m = aVar;
                                    hVar.f155812d = 0;
                                    hVar.f155813e = 0;
                                    hVar.f155814f = 0;
                                    hVar.f155815g = 0;
                                    hVar.f155816h = 0;
                                    hVar.f155824r = 1;
                                    objC = j1Var.c(c1792a, hVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        it = ((RailwayCardFullData) bVar2.a((dx.i) objC)).a().values().iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!((RailwayCardData) next).getScope().getData().s());
                                        railwayCardData = (RailwayCardData) next;
                                        if (railwayCardData != null) {
                                            expirationDate = document.getExpirationDate();
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    hVar.f155817j = cVar2;
                                    hVar.f155818k = jVarA;
                                    hVar.f155819l = vq.j.a(aVar);
                                    hVar.f155820m = vq.j.a(aVar);
                                    hVar.f155821n = aVar;
                                    hVar.f155812d = 0;
                                    hVar.f155813e = 0;
                                    hVar.f155814f = 0;
                                    hVar.f155815g = 0;
                                    hVar.f155816h = 0;
                                    hVar.f155824r = 2;
                                    objC = d1Var.c(c1792a2, hVar);
                                    if (objC != objE) {
                                        cVar = cVar2;
                                        bVar = aVar;
                                        it4 = ((Map) bVar.a((dx.i) objC)).values().iterator();
                                        do {
                                            if (it4.hasNext()) {
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it4.next();
                                        } while (!((RailwayCardDocumentData) next2).getDataContainer().s());
                                        railwayCardDocumentData = (RailwayCardDocumentData) next2;
                                        if (railwayCardDocumentData != null) {
                                            expirationDate = new fz.b.LocalDate(localDateO);
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                dx.i iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 == 1) {
                            bVar2 = (ex.b) hVar.f155820m;
                            oq.u.b(objC);
                            it = ((RailwayCardFullData) bVar2.a((dx.i) objC)).a().values().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((RailwayCardData) next).getScope().getData().s());
                            railwayCardData = (RailwayCardData) next;
                            if (railwayCardData != null && (document = railwayCardData.getDocument()) != null) {
                                expirationDate = document.getExpirationDate();
                            }
                        } else {
                            if (r15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) hVar.f155821n;
                            cVar = (ez.c) hVar.f155817j;
                            oq.u.b(objC);
                            it4 = ((Map) bVar.a((dx.i) objC)).values().iterator();
                            do {
                                if (it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                            } while (!((RailwayCardDocumentData) next2).getDataContainer().s());
                            railwayCardDocumentData = (RailwayCardDocumentData) next2;
                            if (railwayCardDocumentData != null && (dataContainer = railwayCardDocumentData.getDataContainer()) != null && (expiryDate = dataContainer.getExpiryDate()) != null && (localDateO = cVar.o(expiryDate, fz.c.BLANK_REVERSED)) != null) {
                                expirationDate = new fz.b.LocalDate(localDateO);
                            }
                        }
                        return new dx.i.Right(expirationDate);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // c64.a
        public Object f(rq0.b.EnumC4479b enumC4479b, tq.e<? super dx.i<? extends dx.b, fz.b.LocalDate>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            fz.b.LocalDate expirationDate;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f155761r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f155761r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155759p;
            ?? E = uq.b.e();
            int i16 = cVar.f155761r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f155706a;
                            w24.o0 o0Var = this.f155718m;
                            q34.n0 n0Var = this.f155719n;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.o0.Params params = new w24.o0.Params((f24.i) aVar.a(j1.l(enumC4479b)));
                                    cVar.f155749d = vq.j.a(enumC4479b);
                                    cVar.f155750e = jVarA;
                                    cVar.f155751f = vq.j.a(aVar);
                                    cVar.f155752g = vq.j.a(aVar);
                                    cVar.f155753h = aVar;
                                    cVar.f155754j = 0;
                                    cVar.f155755k = 0;
                                    cVar.f155756l = 0;
                                    cVar.f155757m = 0;
                                    cVar.f155758n = 0;
                                    cVar.f155761r = 1;
                                    objC = o0Var.c(params, cVar);
                                    if (objC != E) {
                                        bVar2 = aVar;
                                        expirationDate = ((DynamicDocumentData) bVar2.a((dx.i) objC)).getDocument().getExpirationDate();
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.n0.Params params2 = new q34.n0.Params(enumC4479b);
                                    cVar.f155749d = vq.j.a(enumC4479b);
                                    cVar.f155750e = jVarA;
                                    cVar.f155751f = vq.j.a(aVar);
                                    cVar.f155752g = vq.j.a(aVar);
                                    cVar.f155753h = aVar;
                                    cVar.f155754j = 0;
                                    cVar.f155755k = 0;
                                    cVar.f155756l = 0;
                                    cVar.f155757m = 0;
                                    cVar.f155758n = 0;
                                    cVar.f155761r = 2;
                                    objC = n0Var.c(params2, cVar);
                                    if (objC != E) {
                                        bVar = aVar;
                                        expirationDate = ((DynamicDocumentDataContainer) bVar.a((dx.i) objC)).getSchemaContainer().getExpirationDate();
                                    }
                                }
                                return E;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                E = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(E));
                                dx.i iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            bVar2 = (ex.b) cVar.f155753h;
                            oq.u.b(objC);
                            expirationDate = ((DynamicDocumentData) bVar2.a((dx.i) objC)).getDocument().getExpirationDate();
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f155753h;
                            oq.u.b(objC);
                            expirationDate = ((DynamicDocumentDataContainer) bVar.a((dx.i) objC)).getSchemaContainer().getExpirationDate();
                        }
                        return new dx.i.Right(expirationDate);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:97:0x01af  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            if (r11 == r1) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0124, code lost:
        
            if (r11 == r1) goto L65;
         */
        @Override // c64.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<d64.VehicleData>>> r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 471
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.r5.a.g(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, LOOP:1: B:34:0x00ca->B:36:0x00d0, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:49:0x011b, B:51:0x0129, B:52:0x0138, B:54:0x013e, B:56:0x0155, B:55:0x0150, B:60:0x0161, B:63:0x0170, B:24:0x0060, B:33:0x00af, B:34:0x00ca, B:36:0x00d0), top: B:78:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0129 A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:49:0x011b, B:51:0x0129, B:52:0x0138, B:54:0x013e, B:56:0x0155, B:55:0x0150, B:60:0x0161, B:63:0x0170, B:24:0x0060, B:33:0x00af, B:34:0x00ca, B:36:0x00d0), top: B:78:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x013e A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, LOOP:0: B:52:0x0138->B:54:0x013e, LOOP_END, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:49:0x011b, B:51:0x0129, B:52:0x0138, B:54:0x013e, B:56:0x0155, B:55:0x0150, B:60:0x0161, B:63:0x0170, B:24:0x0060, B:33:0x00af, B:34:0x00ca, B:36:0x00d0), top: B:78:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0150 A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:49:0x011b, B:51:0x0129, B:52:0x0138, B:54:0x013e, B:56:0x0155, B:55:0x0150, B:60:0x0161, B:63:0x0170, B:24:0x0060, B:33:0x00af, B:34:0x00ca, B:36:0x00d0), top: B:78:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.r5$a$g, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // c64.a
        public Object h(tq.e<? super dx.i<? extends dx.b, ? extends List<String>>> eVar) throws Throwable {
            ?? gVar;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            List arrayList;
            Iterator it;
            List<DrivingLicenceScope> listE;
            Iterator it4;
            if (eVar instanceof g) {
                g gVar2 = (g) eVar;
                int i15 = gVar2.f155811q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    gVar2.f155811q = i15 - PKIFailureInfo.systemUnavail;
                    gVar = gVar2;
                } else {
                    gVar = new g(eVar);
                }
            } else {
                gVar = new g(eVar);
            }
            Object objC = gVar.f155809n;
            Object objE = uq.b.e();
            int i16 = gVar.f155811q;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f155706a;
                            w24.m0 m0Var = this.f155716k;
                            q34.m0 m0Var2 = this.f155717l;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    gVar.f155805j = jVarA;
                                    gVar.f155806k = vq.j.a(aVar);
                                    gVar.f155807l = vq.j.a(aVar);
                                    gVar.f155808m = aVar;
                                    gVar.f155800d = 0;
                                    gVar.f155801e = 0;
                                    gVar.f155802f = 0;
                                    gVar.f155803g = 0;
                                    gVar.f155804h = 0;
                                    gVar.f155811q = 1;
                                    objC = m0Var.c(c1792a, gVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        List<DrivingLicenceData> listF = ((DrivingLicenceFullData) bVar2.a((dx.i) objC)).f();
                                        arrayList = new ArrayList(pq.v.y(listF, 10));
                                        it = listF.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((DrivingLicenceData) it.next()).getScope().getDataHeader().getIid());
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    gVar.f155805j = jVarA;
                                    gVar.f155806k = vq.j.a(aVar);
                                    gVar.f155807l = vq.j.a(aVar);
                                    gVar.f155808m = aVar;
                                    gVar.f155800d = 0;
                                    gVar.f155801e = 0;
                                    gVar.f155802f = 0;
                                    gVar.f155803g = 0;
                                    gVar.f155804h = 0;
                                    gVar.f155811q = 2;
                                    objC = m0Var2.c(c1792a2, gVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        listE = ((DrivingLicenceScopes) bVar.a((dx.i) objC)).e();
                                        if (listE != null) {
                                            List<DrivingLicenceScope> list = listE;
                                            arrayList = new ArrayList(pq.v.y(list, 10));
                                            it4 = list.iterator();
                                            while (it4.hasNext()) {
                                                arrayList.add(((DrivingLicenceScope) it4.next()).getMnemonicHeaderContainer().getIid());
                                            }
                                        } else {
                                            arrayList = pq.v.n();
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                gVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(gVar));
                                dx.i iVarA = gVar.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            bVar2 = (ex.b) gVar.f155808m;
                            oq.u.b(objC);
                            List<DrivingLicenceData> listF2 = ((DrivingLicenceFullData) bVar2.a((dx.i) objC)).f();
                            arrayList = new ArrayList(pq.v.y(listF2, 10));
                            it = listF2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((DrivingLicenceData) it.next()).getScope().getDataHeader().getIid());
                            }
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) gVar.f155808m;
                            oq.u.b(objC);
                            listE = ((DrivingLicenceScopes) bVar.a((dx.i) objC)).e();
                            if (listE != null) {
                                List<DrivingLicenceScope> list2 = listE;
                                arrayList = new ArrayList(pq.v.y(list2, 10));
                                it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    arrayList.add(((DrivingLicenceScope) it4.next()).getMnemonicHeaderContainer().getIid());
                                }
                            } else {
                                arrayList = pq.v.n();
                            }
                        }
                        return new dx.i.Right(arrayList);
                    } catch (Exception e18) {
                        e = e18;
                    }
                } catch (CancellationException e19) {
                    throw e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // c64.a
        public Object i(tq.e<? super dx.i<? extends dx.b, fz.b.LocalDate>> eVar) throws Throwable {
            f fVar;
            Object objB;
            ez.c cVar;
            ex.b bVar;
            ex.b bVar2;
            fz.b.LocalDate expirationDate;
            if (eVar instanceof f) {
                fVar = (f) eVar;
                int i15 = fVar.f155799r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar.f155799r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objC = fVar.f155797p;
            Object objE = uq.b.e();
            ?? r15 = fVar.f155799r;
            try {
                try {
                    try {
                        if (r15 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f155706a;
                            k24.h hVar = this.f155714i;
                            q34.c1 c1Var = this.f155715j;
                            ez.c cVar2 = this.f155711f;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    fVar.f155792j = jVarA;
                                    fVar.f155793k = vq.j.a(aVar);
                                    fVar.f155794l = vq.j.a(aVar);
                                    fVar.f155795m = aVar;
                                    fVar.f155787d = 0;
                                    fVar.f155788e = 0;
                                    fVar.f155789f = 0;
                                    fVar.f155790g = 0;
                                    fVar.f155791h = 0;
                                    fVar.f155799r = 1;
                                    objC = hVar.c(c1792a, fVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        expirationDate = ((StudentCardData) bVar2.a((dx.i) objC)).getDocument().getExpirationDate();
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    fVar.f155792j = cVar2;
                                    fVar.f155793k = jVarA;
                                    fVar.f155794l = vq.j.a(aVar);
                                    fVar.f155795m = vq.j.a(aVar);
                                    fVar.f155796n = aVar;
                                    fVar.f155787d = 0;
                                    fVar.f155788e = 0;
                                    fVar.f155789f = 0;
                                    fVar.f155790g = 0;
                                    fVar.f155791h = 0;
                                    fVar.f155799r = 2;
                                    objC = c1Var.c(c1792a2, fVar);
                                    if (objC != objE) {
                                        cVar = cVar2;
                                        bVar = aVar;
                                        expirationDate = new fz.b.LocalDate(cVar.l(((StudentCardDocumentData) bVar.a((dx.i) objC)).getExpireDate()));
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVarA;
                                px.f fVar2 = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(r15));
                                dx.i iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 == 1) {
                            bVar2 = (ex.b) fVar.f155795m;
                            oq.u.b(objC);
                            expirationDate = ((StudentCardData) bVar2.a((dx.i) objC)).getDocument().getExpirationDate();
                        } else {
                            if (r15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) fVar.f155796n;
                            cVar = (ez.c) fVar.f155792j;
                            oq.u.b(objC);
                            expirationDate = new fz.b.LocalDate(cVar.l(((StudentCardDocumentData) bVar.a((dx.i) objC)).getExpireDate()));
                        }
                        return new dx.i.Right(expirationDate);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }
    }

    private r5() {
    }

    public final c64.a a(c54.b isFeatureEnabledUseCase, k24.e getMIdCardDataUC, q34.w0 getMIdCardDataUseCase, q34.d1 getUutCardDataUC, w24.j1 getRailwayCardDataUC, q34.s0 getFamilyCardDataUC, w24.s0 containersGetFamilyCardDataUC, q34.c1 getStudentCardDocumentsUseCase, k24.h getStudentCardDataUC, ez.c dateConverter, q34.v0 getLinkedDocumentsUseCase, w24.v getAllDocumentsWithCertificateIdUC, w24.m0 getDrivingLicenceDataUC, q34.m0 getDrivingLicenceDocumentsFromContainerUseCase, q34.e1 getVehiclesDataUseCase, w24.q1 getVehiclesDataUC, w24.o0 getDynamicDocumentDataByTypeUC, q34.n0 getDynamicDocumentFromContainerUseCase) {
        return new a(isFeatureEnabledUseCase, getMIdCardDataUC, getMIdCardDataUseCase, getRailwayCardDataUC, getUutCardDataUC, dateConverter, containersGetFamilyCardDataUC, getFamilyCardDataUC, getStudentCardDataUC, getStudentCardDocumentsUseCase, getDrivingLicenceDataUC, getDrivingLicenceDocumentsFromContainerUseCase, getDynamicDocumentDataByTypeUC, getDynamicDocumentFromContainerUseCase, getAllDocumentsWithCertificateIdUC, getLinkedDocumentsUseCase, getVehiclesDataUC, getVehiclesDataUseCase);
    }
}
