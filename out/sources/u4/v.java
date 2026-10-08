package u4;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Lu4/k;", "Lu4/x0;", "typefaceRequest", "Lu4/h;", "asyncTypefaceCache", "Lu4/k0;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Loq/r;", "b", "(Ljava/util/List;Lu4/x0;Lu4/h;Lu4/k0;Ler/l;)Loq/r;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.r<List<k>, Object> b(List<? extends k> list, TypefaceRequest typefaceRequest, h hVar, k0 k0Var, er.l<? super TypefaceRequest, ? extends Object> lVar) {
        Object objB;
        Object objB2;
        Object objB3;
        Object result;
        int size = list.size();
        List listT = null;
        for (int i15 = 0; i15 < size; i15++) {
            k kVar = list.get(i15);
            int loadingStrategy = kVar.getLoadingStrategy();
            w.Companion companion = w.INSTANCE;
            if (w.e(loadingStrategy, companion.b())) {
                synchronized (hVar.cacheLock) {
                    try {
                        h.Key key = new h.Key(kVar, k0Var.getCacheKey());
                        h.a aVar = (h.a) hVar.resultCache.d(key);
                        if (aVar == null) {
                            aVar = (h.a) hVar.permanentCache.e(key);
                        }
                        if (aVar != null) {
                            objB2 = aVar.getResult();
                        } else {
                            oq.i0 i0Var = oq.i0.f148189a;
                            try {
                                objB = k0Var.a(kVar);
                            } catch (Exception unused) {
                                objB = lVar.b(typefaceRequest);
                            }
                            Object obj = objB;
                            h.f(hVar, kVar, k0Var, obj, false, 8, null);
                            objB2 = obj;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (objB2 == null) {
                    objB2 = lVar.b(typefaceRequest);
                }
                return oq.y.a(listT, a0.a(typefaceRequest.getFontSynthesis(), objB2, kVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
            }
            if (w.e(loadingStrategy, companion.c())) {
                synchronized (hVar.cacheLock) {
                    try {
                        h.Key key2 = new h.Key(kVar, k0Var.getCacheKey());
                        h.a aVar2 = (h.a) hVar.resultCache.d(key2);
                        if (aVar2 == null) {
                            aVar2 = (h.a) hVar.permanentCache.e(key2);
                        }
                        if (aVar2 != null) {
                            result = aVar2.getResult();
                        } else {
                            oq.i0 i0Var2 = oq.i0.f148189a;
                            try {
                                oq.t.Companion companion2 = oq.t.INSTANCE;
                                objB3 = oq.t.b(k0Var.a(kVar));
                            } catch (Throwable th5) {
                                oq.t.Companion companion3 = oq.t.INSTANCE;
                                objB3 = oq.t.b(oq.u.a(th5));
                            }
                            Object obj2 = oq.t.f(objB3) ? null : objB3;
                            h.f(hVar, kVar, k0Var, obj2, false, 8, null);
                            result = obj2;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                if (result != null) {
                    return oq.y.a(listT, a0.a(typefaceRequest.getFontSynthesis(), result, kVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            } else {
                if (!w.e(loadingStrategy, companion.a())) {
                    throw new IllegalStateException("Unknown font type " + kVar);
                }
                h.a aVarD = hVar.d(kVar, k0Var);
                if (aVarD != null) {
                    if (!h.a.e(aVarD.getResult()) && aVarD.getResult() != null) {
                        return oq.y.a(listT, a0.a(typefaceRequest.getFontSynthesis(), aVarD.getResult(), kVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                    }
                } else if (listT == null) {
                    listT = pq.v.t(kVar);
                } else {
                    listT.add(kVar);
                }
            }
        }
        return oq.y.a(listT, lVar.b(typefaceRequest));
    }
}
