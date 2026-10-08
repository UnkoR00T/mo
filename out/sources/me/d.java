package me;

import android.util.Log;
import be.v;
import io.sentry.android.core.c2;
import java.io.File;
import java.io.IOException;
import zd.k;

/* JADX INFO: loaded from: classes3.dex */
public class d implements k<c> {
    @Override // zd.k
    public zd.c b(zd.h hVar) {
        return zd.c.SOURCE;
    }

    @Override // zd.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(v<c> vVar, File file, zd.h hVar) throws Throwable {
        try {
            ve.a.f(vVar.get().c(), file);
            return true;
        } catch (IOException e15) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            c2.h("GifEncoder", "Failed to encode GIF drawable data", e15);
            return false;
        }
    }
}
