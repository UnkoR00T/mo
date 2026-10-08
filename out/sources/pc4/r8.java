package pc4;

import al0.ChildData;
import cv0.BEApplicant;
import cv0.BEContact;
import cv0.BECountry;
import cv0.BECountryDetails;
import cv0.BEPersonalData;
import cv0.BEProfile;
import cv0.BETravel;
import cv0.BETravelRequestModel;
import cv0.BEWarning;
import ga3.Stage;
import ht0.BEPlaceDetails;
import ht0.BEPlaceSuggestion;
import iq0.FeatureFlag;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v93.Country;
import v93.CountryDetails;
import vy.Coordinates;
import xi0.ContactDetails;
import z93.PlaceDetails;
import z93.PlaceSuggestion;
import z93.Travel;
import z93.TravelChildData;
import z93.TravelContactDetails;
import z93.TravelPersonalData;
import z93.TravelRequestModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ_\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"Lpc4/r8;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lea3/a;", "e", "(Lc54/b;)Lea3/a;", "Lev0/a;", "changeCountrySubscriptionStatusUC", "Lev0/c;", "deleteTravelUC", "Lev0/e;", "getCountryDetailsUC", "Lev0/i;", "getTravels", "Lev0/k;", "registerTravel", "Lev0/m;", "updateTravelUC", "Lev0/o;", "getTravelAbroadCountries", "Lev0/q;", "getTravelAbroadPersonalDataUC", "Lev0/g;", "getTravelPdfConfirmationUC", "Lh64/e;", "getFeatureFlagListUseCase", "Lx93/d;", "d", "(Lev0/a;Lev0/c;Lev0/e;Lev0/i;Lev0/k;Lev0/m;Lev0/o;Lev0/q;Lev0/g;Lh64/e;)Lx93/d;", "Ljt0/a;", "getPlaceDetailsForCoordinatesUC", "Ljt0/c;", "getPlaceDetailsUC", "Ljt0/e;", "getPlaceSuggestionsUC", "Lx93/c;", "c", "(Ljt0/a;Ljt0/c;Ljt0/e;)Lx93/c;", "Lfj0/g;", "getContactDetailsUseCase", "Lx93/a;", "a", "(Lfj0/g;)Lx93/a;", "Lml0/j;", "getChildrenUC", "Lx93/b;", "b", "(Lml0/j;)Lx93/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r8 f155828a = new r8();

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/r8$a", "Lx93/a;", "Ldx/i;", "Ldx/b;", "Lz93/o;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements x93.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fj0.g f155829a;

        /* JADX INFO: renamed from: pc4.r8$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3862a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155830d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155832f;

            C3862a(tq.e<? super C3862a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155830d = obj;
                this.f155832f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        a(fj0.g gVar) {
            this.f155829a = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.a
        public Object a(tq.e<? super dx.i<? extends dx.b, TravelContactDetails>> eVar) throws Throwable {
            C3862a c3862a;
            if (eVar instanceof C3862a) {
                c3862a = (C3862a) eVar;
                int i15 = c3862a.f155832f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3862a.f155832f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3862a = new C3862a(eVar);
                }
            } else {
                c3862a = new C3862a(eVar);
            }
            Object objC = c3862a.f155830d;
            Object objE = uq.b.e();
            int i16 = c3862a.f155832f;
            if (i16 == 0) {
                oq.u.b(objC);
                fj0.g gVar = this.f155829a;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                c3862a.f155832f = 1;
                objC = gVar.c(c1792a, c3862a);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(q8.E((ContactDetails) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"pc4/r8$b", "Lx93/b;", "Ldx/i;", "Ldx/b;", "", "Lz93/j;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements x93.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ml0.j f155833a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155834d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155836f;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155834d = obj;
                this.f155836f |= PKIFailureInfo.systemUnavail;
                return b.this.a(this);
            }
        }

        b(ml0.j jVar) {
            this.f155833a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.b
        public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<TravelChildData>>> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f155836f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f155836f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objC = aVar.f155834d;
            Object objE = uq.b.e();
            int i16 = aVar.f155836f;
            if (i16 == 0) {
                oq.u.b(objC);
                ml0.j jVar = this.f155833a;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                aVar.f155836f = 1;
                objC = jVar.c(c1792a, aVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q8.z((ChildData) it.next()));
            }
            return new dx.i.Right(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\u000f¨\u0006\u0015"}, d2 = {"pc4/r8$c", "Lx93/c;", "Lvy/c;", "coordinates", "Ldx/i;", "Ldx/b;", "Lz93/f;", "a", "(Lvy/c;Ltq/e;)Ljava/lang/Object;", "Lz93/e;", "placeId", "Lz93/h;", "sessionToken", "Lz93/d;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "query", "", "Lz93/g;", "b", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements x93.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jt0.a f155837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ jt0.c f155838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ jt0.e f155839c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155840d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155841e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f155842f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155844h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155842f = obj;
                this.f155844h |= PKIFailureInfo.systemUnavail;
                return c.this.c(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155845d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155846e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155848g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155846e = obj;
                this.f155848g |= PKIFailureInfo.systemUnavail;
                return c.this.a(null, this);
            }
        }

        /* JADX INFO: renamed from: pc4.r8$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3863c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155849d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155850e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f155851f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155853h;

            C3863c(tq.e<? super C3863c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155851f = obj;
                this.f155853h |= PKIFailureInfo.systemUnavail;
                return c.this.b(null, null, this);
            }
        }

        c(jt0.a aVar, jt0.c cVar, jt0.e eVar) {
            this.f155837a = aVar;
            this.f155838b = cVar;
            this.f155839c = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.c
        public Object a(Coordinates coordinates, tq.e<? super dx.i<? extends dx.b, ? extends z93.f>> eVar) throws Throwable {
            b bVar;
            Object notFound;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f155848g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f155848g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f155846e;
            Object objE = uq.b.e();
            int i16 = bVar.f155848g;
            if (i16 == 0) {
                oq.u.b(objC);
                jt0.a aVar = this.f155837a;
                jt0.a.Params params = new jt0.a.Params(coordinates);
                bVar.f155845d = vq.j.a(coordinates);
                bVar.f155848g = 1;
                objC = aVar.c(params, bVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            jt0.a.b bVar2 = (jt0.a.b) ((dx.i.Right) iVar).b();
            if (bVar2 instanceof jt0.a.b.Found) {
                notFound = new z93.f.Found(q8.w(((jt0.a.b.Found) bVar2).getDetails()));
            } else {
                if (!(bVar2 instanceof jt0.a.b.NotFound)) {
                    throw new oq.p();
                }
                notFound = new z93.f.NotFound(((jt0.a.b.NotFound) bVar2).getCoordinates());
            }
            return new dx.i.Right(notFound);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.c
        public Object b(String str, String str2, tq.e<? super dx.i<? extends dx.b, ? extends List<PlaceSuggestion>>> eVar) throws Throwable {
            C3863c c3863c;
            if (eVar instanceof C3863c) {
                c3863c = (C3863c) eVar;
                int i15 = c3863c.f155853h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3863c.f155853h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3863c = new C3863c(eVar);
                }
            } else {
                c3863c = new C3863c(eVar);
            }
            Object objC = c3863c.f155851f;
            Object objE = uq.b.e();
            int i16 = c3863c.f155853h;
            if (i16 == 0) {
                oq.u.b(objC);
                jt0.e eVar2 = this.f155839c;
                jt0.e.Params params = new jt0.e.Params(str, q8.f(str2), null);
                c3863c.f155849d = vq.j.a(str);
                c3863c.f155850e = vq.j.a(str2);
                c3863c.f155853h = 1;
                objC = eVar2.c(params, c3863c);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q8.x((BEPlaceSuggestion) it.next()));
            }
            return new dx.i.Right(arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.c
        public Object c(String str, String str2, tq.e<? super dx.i<? extends dx.b, PlaceDetails>> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f155844h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f155844h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objC = aVar.f155842f;
            Object objE = uq.b.e();
            int i16 = aVar.f155844h;
            if (i16 == 0) {
                oq.u.b(objC);
                jt0.c cVar = this.f155838b;
                jt0.c.Params params = new jt0.c.Params(q8.e(str), q8.f(str2), null);
                aVar.f155840d = vq.j.a(str);
                aVar.f155841e = vq.j.a(str2);
                aVar.f155844h = 1;
                objC = cVar.c(params, aVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(q8.w((BEPlaceDetails) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }
    }

    @Metadata(d1 = {"\u0000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00110\u0006H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00130\u0006H\u0096@¢\u0006\u0004\b\u001f\u0010\u0016J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u0006H\u0096@¢\u0006\u0004\b!\u0010\u0016J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b#\u0010\u000eJ\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"pc4/r8$d", "Lx93/d;", "", "subscribe", "", "isoCode", "Ldx/i;", "Ldx/b;", "Loq/i0;", "g", "(ZLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lz93/s;", "travelUuid", "i", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lv93/d;", "b", "", "Lz93/r;", "", "Lz93/i;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lz93/q;", "model", "j", "(Lz93/q;Ltq/e;)Ljava/lang/Object;", "travelRequestModel", "h", "(Ljava/lang/String;Lz93/q;Ltq/e;)Ljava/lang/Object;", "Lv93/c;", "a", "Lz93/p;", "c", "Ljava/io/InputStream;", "f", "e", "()Z", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements x93.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ev0.a f155854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ev0.c f155855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ev0.e f155856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ev0.i f155857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ev0.k f155858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ev0.m f155859f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ev0.o f155860g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ev0.q f155861h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ev0.g f155862i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h64.e f155863j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155864d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155866f;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155864d = obj;
                this.f155866f |= PKIFailureInfo.systemUnavail;
                return d.this.a(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155867d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155868e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155870g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155868e = obj;
                this.f155870g |= PKIFailureInfo.systemUnavail;
                return d.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155871d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155873f;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155871d = obj;
                this.f155873f |= PKIFailureInfo.systemUnavail;
                return d.this.c(this);
            }
        }

        /* JADX INFO: renamed from: pc4.r8$d$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3864d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155874d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155876f;

            C3864d(tq.e<? super C3864d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155874d = obj;
                this.f155876f |= PKIFailureInfo.systemUnavail;
                return d.this.d(this);
            }
        }

        d(ev0.a aVar, ev0.c cVar, ev0.e eVar, ev0.i iVar, ev0.k kVar, ev0.m mVar, ev0.o oVar, ev0.q qVar, ev0.g gVar, h64.e eVar2) {
            this.f155854a = aVar;
            this.f155855b = cVar;
            this.f155856c = eVar;
            this.f155857d = iVar;
            this.f155858e = kVar;
            this.f155859f = mVar;
            this.f155860g = oVar;
            this.f155861h = qVar;
            this.f155862i = gVar;
            this.f155863j = eVar2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.d
        public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<Country>>> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f155866f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f155866f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objC = aVar.f155864d;
            Object objE = uq.b.e();
            int i16 = aVar.f155866f;
            if (i16 == 0) {
                oq.u.b(objC);
                ev0.o oVar = this.f155860g;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                aVar.f155866f = 1;
                objC = oVar.c(c1792a, aVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q8.m((BECountry) it.next()));
            }
            return new dx.i.Right(arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.d
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, CountryDetails>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f155870g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f155870g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f155868e;
            Object objE = uq.b.e();
            int i16 = bVar.f155870g;
            if (i16 == 0) {
                oq.u.b(objC);
                ev0.e eVar2 = this.f155856c;
                ev0.e.Params params = new ev0.e.Params(str);
                bVar.f155867d = vq.j.a(str);
                bVar.f155870g = 1;
                objC = eVar2.c(params, bVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            BECountryDetails bECountryDetails = (BECountryDetails) ((dx.i.Right) iVar).b();
            int expiryMonths = bECountryDetails.getConfig().getExpiryMonths();
            String isoCode = bECountryDetails.getIsoCode();
            String name = bECountryDetails.getName();
            List<BEWarning> listI = bECountryDetails.i();
            ArrayList arrayList = new ArrayList(pq.v.y(listI, 10));
            Iterator<T> it = listI.iterator();
            while (it.hasNext()) {
                arrayList.add(q8.q((BEWarning) it.next()));
            }
            String flag = bECountryDetails.getFlag();
            String map = bECountryDetails.getMap();
            LocalDate updatedDate = bECountryDetails.getUpdatedDate();
            Map<cv0.c, List<BEContact>> mapB = bECountryDetails.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap(pq.v0.e(mapB.size()));
            Iterator<T> it4 = mapB.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                linkedHashMap.put(q8.l((cv0.c) entry.getKey()), entry.getValue());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(pq.v0.e(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Iterable iterable = (Iterable) entry2.getValue();
                ArrayList arrayList2 = new ArrayList(pq.v.y(iterable, 10));
                Iterator it5 = iterable.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(q8.k((BEContact) it5.next()));
                }
                linkedHashMap2.put(key, arrayList2);
            }
            List<BEProfile> listG = bECountryDetails.g();
            ArrayList arrayList3 = new ArrayList(pq.v.y(listG, 10));
            Iterator<T> it6 = listG.iterator();
            while (it6.hasNext()) {
                arrayList3.add(q8.n((BEProfile) it6.next()));
            }
            return new dx.i.Right(new CountryDetails(expiryMonths, isoCode, name, arrayList, flag, map, updatedDate, linkedHashMap2, arrayList3));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.d
        public Object c(tq.e<? super dx.i<? extends dx.b, TravelPersonalData>> eVar) throws Throwable {
            c cVar;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f155873f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f155873f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155871d;
            Object objE = uq.b.e();
            int i16 = cVar.f155873f;
            if (i16 == 0) {
                oq.u.b(objC);
                ev0.q qVar = this.f155861h;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                cVar.f155873f = 1;
                objC = qVar.c(c1792a, cVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(q8.F((BEPersonalData) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x93.d
        public Object d(tq.e<? super dx.i<? extends dx.b, ? extends Map<z93.r, ? extends List<Travel>>>> eVar) throws Throwable {
            C3864d c3864d;
            if (eVar instanceof C3864d) {
                c3864d = (C3864d) eVar;
                int i15 = c3864d.f155876f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3864d.f155876f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3864d = new C3864d(eVar);
                }
            } else {
                c3864d = new C3864d(eVar);
            }
            Object objC = c3864d.f155874d;
            Object objE = uq.b.e();
            int i16 = c3864d.f155876f;
            if (i16 == 0) {
                oq.u.b(objC);
                ev0.i iVar = this.f155857d;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                c3864d.f155876f = 1;
                objC = iVar.c(c1792a, c3864d);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar2 = (dx.i) objC;
            if (iVar2 instanceof dx.i.Left) {
                return iVar2;
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            Map map = (Map) ((dx.i.Right) iVar2).b();
            LinkedHashMap linkedHashMap = new LinkedHashMap(pq.v0.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(q8.G((cv0.p) entry.getKey()), entry.getValue());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(pq.v0.e(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Iterable iterable = (Iterable) entry2.getValue();
                ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(q8.y((BETravel) it.next()));
                }
                linkedHashMap2.put(key, arrayList);
            }
            return new dx.i.Right(linkedHashMap2);
        }

        @Override // x93.d
        public boolean e() {
            Object next;
            Iterator<T> it = this.f155863j.a(gz.b.a.C1792a.f78542a).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((FeatureFlag) next).getType() != iq0.y.TRAVEL_REGISTRATION_CONFIRMATION);
            FeatureFlag featureFlag = (FeatureFlag) next;
            if (featureFlag != null) {
                return featureFlag.getFeatureActive();
            }
            return false;
        }

        @Override // x93.d
        public Object f(String str, tq.e<? super dx.i<? extends dx.b, ? extends InputStream>> eVar) {
            return this.f155862i.c(new ev0.g.Params(q8.i(str), null), eVar);
        }

        @Override // x93.d
        public Object g(boolean z15, String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f155854a.c(new ev0.a.Params(z15, str), eVar);
        }

        @Override // x93.d
        public Object h(String str, TravelRequestModel travelRequestModel, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            ev0.m mVar = this.f155859f;
            String strI = q8.i(str);
            BEApplicant bEApplicantA = q8.a(travelRequestModel.getApplicant());
            List<Stage> listC = travelRequestModel.c();
            ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(q8.g((Stage) it.next()));
            }
            List<TravelPersonalData> listB = travelRequestModel.b();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it4 = listB.iterator();
            while (it4.hasNext()) {
                arrayList2.add(q8.b((TravelPersonalData) it4.next()));
            }
            return mVar.c(new ev0.m.Params(strI, new BETravelRequestModel(bEApplicantA, arrayList, arrayList2), null), eVar);
        }

        @Override // x93.d
        public Object i(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f155855b.c(new ev0.c.Params(q8.i(str), null), eVar);
        }

        @Override // x93.d
        public Object j(TravelRequestModel travelRequestModel, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f155858e.c(new ev0.k.Params(q8.h(travelRequestModel)), eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/r8$e", "Lea3/a;", "", "a", "()Z", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements ea3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155877a;

        e(c54.b bVar) {
            this.f155877a = bVar;
        }

        @Override // ea3.a
        public boolean a() {
            return this.f155877a.a(b54.c.ODYSSEUS_GEOLOCATION_NATIVE).booleanValue();
        }
    }

    private r8() {
    }

    public final x93.a a(fj0.g getContactDetailsUseCase) {
        return new a(getContactDetailsUseCase);
    }

    public final x93.b b(ml0.j getChildrenUC) {
        return new b(getChildrenUC);
    }

    public final x93.c c(jt0.a getPlaceDetailsForCoordinatesUC, jt0.c getPlaceDetailsUC, jt0.e getPlaceSuggestionsUC) {
        return new c(getPlaceDetailsForCoordinatesUC, getPlaceDetailsUC, getPlaceSuggestionsUC);
    }

    public final x93.d d(ev0.a changeCountrySubscriptionStatusUC, ev0.c deleteTravelUC, ev0.e getCountryDetailsUC, ev0.i getTravels, ev0.k registerTravel, ev0.m updateTravelUC, ev0.o getTravelAbroadCountries, ev0.q getTravelAbroadPersonalDataUC, ev0.g getTravelPdfConfirmationUC, h64.e getFeatureFlagListUseCase) {
        return new d(changeCountrySubscriptionStatusUC, deleteTravelUC, getCountryDetailsUC, getTravels, registerTravel, updateTravelUC, getTravelAbroadCountries, getTravelAbroadPersonalDataUC, getTravelPdfConfirmationUC, getFeatureFlagListUseCase);
    }

    public final ea3.a e(c54.b isFeatureEnabledUseCase) {
        return new e(isFeatureEnabledUseCase);
    }
}
