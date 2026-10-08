package com.google.android.libraries.places.api.net.kotlin;

import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.k41;
import ii.d0;
import ii.k0;
import ii.l0;
import java.util.List;
import ji.n;
import ji.p;
import ji.q;
import ji.r;
import ji.s;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b\u0010\u0010\r\u001a@\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0087@¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0087@¢\u0006\u0004\b \u0010!\u001a(\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0087@¢\u0006\u0004\b \u0010$\u001a@\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010%\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b(\u0010\u0019\u001a@\u0010-\u001a\u00020,*\u00020\u00002\u0006\u0010*\u001a\u00020)2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lji/n;", "Lkotlin/Function1;", "Lji/g$a;", "Loq/i0;", "actions", "Lji/h;", "awaitFindAutocompletePredictions", "(Lji/n;Ler/l;Ltq/e;)Ljava/lang/Object;", "Lii/k0;", "photoMetadata", "Lji/a$a;", "Lji/b;", "awaitFetchPhoto", "(Lji/n;Lii/k0;Ler/l;Ltq/e;)Ljava/lang/Object;", "Lji/e$a;", "Lji/f;", "awaitFetchResolvedPhotoUri", "", "placeId", "", "Lii/l0$d;", "placeFields", "Lji/c$a;", "Lji/d;", "awaitFetchPlace", "(Lji/n;Ljava/lang/String;Ljava/util/List;Ler/l;Ltq/e;)Ljava/lang/Object;", "Lji/j;", "awaitFindCurrentPlace", "(Lji/n;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "", "utcTimeMillis", "Lji/l;", "awaitIsOpen", "(Lji/n;Ljava/lang/String;Ljava/lang/Long;Ltq/e;)Ljava/lang/Object;", "Lii/l0;", "place", "(Lji/n;Lii/l0;Ljava/lang/Long;Ltq/e;)Ljava/lang/Object;", "textQuery", "Lji/p$a;", "Lji/q;", "awaitSearchByText", "Lii/d0;", "locationRestriction", "Lji/r$a;", "Lji/s;", "awaitSearchNearby", "(Lji/n;Lii/d0;Ljava/util/List;Ler/l;Ltq/e;)Ljava/lang/Object;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class PlacesClientKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    @oq.a
    public static final Object awaitFetchPhoto(@RecentlyNonNull n nVar, @RecentlyNonNull k0 k0Var, @RecentlyNonNull er.l<? super ji.a.AbstractC2439a, i0> lVar, @RecentlyNonNull tq.e<? super ji.b> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f31530e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f31530e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f31529d;
        Object objE = uq.b.e();
        int i16 = dVar.f31530e;
        if (i16 == 0) {
            u.b(objB);
            vh.b bVar = new vh.b();
            ji.a.AbstractC2439a abstractC2439aB = ji.a.b(k0Var);
            abstractC2439aB.d(bVar.b());
            lVar.b(abstractC2439aB);
            vh.l lVarC = nVar.c(abstractC2439aB.a(), k41.PROGRAMMATIC_KOTLIN_API);
            dVar.f31530e = 1;
            objB = tu.b.b(lVarC, bVar, dVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    public static final Object awaitFetchPlace(@RecentlyNonNull n nVar, @RecentlyNonNull String str, @RecentlyNonNull List<? extends l0.d> list, @RecentlyNonNull er.l<? super ji.c.a, i0> lVar, @RecentlyNonNull tq.e<? super ji.d> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f31532e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f31532e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f31531d;
        Object objE = uq.b.e();
        int i16 = eVar2.f31532e;
        if (i16 == 0) {
            u.b(objB);
            vh.b bVar = new vh.b();
            ji.c.a aVarB = ji.c.b(str, list);
            aVarB.b(bVar.b());
            lVar.b(aVarB);
            vh.l lVarE = nVar.e(aVarB.a(), k41.PROGRAMMATIC_KOTLIN_API);
            eVar2.f31532e = 1;
            objB = tu.b.b(lVarE, bVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    public static final Object awaitFetchResolvedPhotoUri(@RecentlyNonNull n nVar, @RecentlyNonNull k0 k0Var, @RecentlyNonNull er.l<? super ji.e.a, i0> lVar, @RecentlyNonNull tq.e<? super ji.f> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f31534e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f31534e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objB = fVar.f31533d;
        Object objE = uq.b.e();
        int i16 = fVar.f31534e;
        if (i16 == 0) {
            u.b(objB);
            vh.b bVar = new vh.b();
            ji.e.a aVarB = ji.e.b(k0Var);
            aVarB.d(bVar.b());
            lVar.b(aVarB);
            vh.l lVarI = nVar.i(aVarB.a(), k41.PROGRAMMATIC_KOTLIN_API);
            fVar.f31534e = 1;
            objB = tu.b.b(lVarI, bVar, fVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    public static final Object awaitFindAutocompletePredictions(@RecentlyNonNull n nVar, @RecentlyNonNull er.l<? super ji.g.a, i0> lVar, @RecentlyNonNull tq.e<? super ji.h> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f31536e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f31536e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f31535d;
        Object objE = uq.b.e();
        int i16 = gVar.f31536e;
        if (i16 == 0) {
            u.b(objB);
            vh.b bVar = new vh.b();
            ji.g.a aVarB = ji.g.b();
            aVarB.d(bVar.b());
            lVar.b(aVarB);
            vh.l lVarB = nVar.b(aVarB.a(), k41.PROGRAMMATIC_KOTLIN_API);
            gVar.f31536e = 1;
            objB = tu.b.b(lVarB, bVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    @oq.a
    public static final Object awaitFindCurrentPlace(@RecentlyNonNull n nVar, @RecentlyNonNull List<? extends l0.d> list, @RecentlyNonNull tq.e<? super ji.j> eVar) throws Throwable {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f31538e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f31538e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objB = hVar.f31537d;
        Object objE = uq.b.e();
        int i16 = hVar.f31538e;
        if (i16 == 0) {
            u.b(objB);
            final vh.b bVar = new vh.b();
            vh.l lVarG = nVar.g(ki.a.a(list, new er.l() { // from class: com.google.android.libraries.places.api.net.kotlin.a
                @Override // er.l
                public final /* synthetic */ Object b(Object obj) {
                    ((ji.i.a) obj).b(bVar.b());
                    return i0.f148189a;
                }
            }), null, k41.PROGRAMMATIC_KOTLIN_API);
            hVar.f31538e = 1;
            objB = tu.b.b(lVarG, bVar, hVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    public static final Object awaitIsOpen(@RecentlyNonNull n nVar, @RecentlyNonNull l0 l0Var, Long l15, @RecentlyNonNull tq.e<? super ji.l> eVar) throws Throwable {
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f31542e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f31542e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objB = jVar.f31541d;
        Object objE = uq.b.e();
        int i16 = jVar.f31542e;
        if (i16 == 0) {
            u.b(objB);
            final vh.b bVar = new vh.b();
            vh.l lVarF = nVar.f(ki.b.a(l0Var, l15, new er.l() { // from class: com.google.android.libraries.places.api.net.kotlin.c
                @Override // er.l
                public final /* synthetic */ Object b(Object obj) {
                    ((ji.k.a) obj).b(bVar.b());
                    return i0.f148189a;
                }
            }), k41.PROGRAMMATIC_KOTLIN_API);
            jVar.f31542e = 1;
            objB = tu.b.b(lVarF, bVar, jVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    public static final Object awaitSearchByText(@RecentlyNonNull n nVar, @RecentlyNonNull String str, @RecentlyNonNull List<? extends l0.d> list, @RecentlyNonNull er.l<? super p.a, i0> lVar, @RecentlyNonNull tq.e<? super q> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f31544e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f31544e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f31543d;
        Object objE = uq.b.e();
        int i16 = kVar.f31544e;
        if (i16 == 0) {
            u.b(objB);
            vh.b bVar = new vh.b();
            p.a aVarB = p.b(str, list);
            aVarB.e(bVar.b());
            lVar.b(aVarB);
            vh.l lVarD = nVar.d(aVarB.a(), k41.PROGRAMMATIC_KOTLIN_API);
            kVar.f31544e = 1;
            objB = tu.b.b(lVarD, bVar, kVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    public static final Object awaitSearchNearby(@RecentlyNonNull n nVar, @RecentlyNonNull d0 d0Var, @RecentlyNonNull List<? extends l0.d> list, @RecentlyNonNull er.l<? super r.a, i0> lVar, @RecentlyNonNull tq.e<? super s> eVar) throws Throwable {
        l lVar2;
        if (eVar instanceof l) {
            lVar2 = (l) eVar;
            int i15 = lVar2.f31546e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar2.f31546e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar2 = new l(eVar);
            }
        } else {
            lVar2 = new l(eVar);
        }
        Object objB = lVar2.f31545d;
        Object objE = uq.b.e();
        int i16 = lVar2.f31546e;
        if (i16 == 0) {
            u.b(objB);
            vh.b bVar = new vh.b();
            r.a aVarB = r.b(d0Var, list);
            aVarB.h(bVar.b());
            lVar.b(aVarB);
            vh.l lVarA = nVar.a(aVarB.a(), k41.PROGRAMMATIC_KOTLIN_API);
            lVar2.f31546e = 1;
            objB = tu.b.b(lVarA, bVar, lVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RecentlyNullable
    @Keep
    public static final Object awaitIsOpen(@RecentlyNonNull n nVar, @RecentlyNonNull String str, Long l15, @RecentlyNonNull tq.e<? super ji.l> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f31540e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f31540e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f31539d;
        Object objE = uq.b.e();
        int i16 = iVar.f31540e;
        if (i16 == 0) {
            u.b(objB);
            final vh.b bVar = new vh.b();
            vh.l lVarF = nVar.f(ki.b.b(str, l15, new er.l() { // from class: com.google.android.libraries.places.api.net.kotlin.b
                @Override // er.l
                public final /* synthetic */ Object b(Object obj) {
                    ((ji.k.a) obj).b(bVar.b());
                    return i0.f148189a;
                }
            }), k41.PROGRAMMATIC_KOTLIN_API);
            iVar.f31540e = 1;
            objB = tu.b.b(lVarF, bVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        return objB;
    }
}
