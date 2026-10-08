package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class vy extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final az f34094a;

    public vy(az azVar) {
        this.f34094a = azVar;
    }

    @Override // com.google.android.libraries.places.internal.p00
    public final /* synthetic */ Object a(xx xxVar, ly lyVar) throws lz {
        int i15 = az.zzd;
        az azVarE = this.f34094a.E();
        try {
            v00 v00VarB = r00.a().b(azVarE.getClass());
            v00VarB.f(azVarE, yx.Y(xxVar), lyVar);
            v00VarB.h(azVarE);
            return azVarE;
        } catch (g10 e15) {
            throw e15.a();
        } catch (lz e16) {
            if (e16.b()) {
                throw new lz(e16);
            }
            throw e16;
        } catch (IOException e17) {
            if (e17.getCause() instanceof lz) {
                throw ((lz) e17.getCause());
            }
            throw new lz(e17);
        } catch (RuntimeException e18) {
            if (e18.getCause() instanceof lz) {
                throw ((lz) e18.getCause());
            }
            throw e18;
        }
    }
}
