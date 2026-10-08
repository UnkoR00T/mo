package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import wl.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    @Deprecated
    public q() {
    }

    public static l b(Reader reader) {
        try {
            zl.a aVar = new zl.a(reader);
            l lVarC = c(aVar);
            if (!lVarC.k() && aVar.a0() != zl.b.END_DOCUMENT) {
                throw new u("Did not consume the entire document.");
            }
            return lVarC;
        } catch (IOException e15) {
            throw new m(e15);
        } catch (NumberFormatException | zl.d e16) {
            throw new u(e16);
        }
    }

    public static l c(zl.a aVar) {
        x xVarH = aVar.H();
        if (xVarH == x.LEGACY_STRICT) {
            aVar.t0(x.LENIENT);
        }
        try {
            try {
                l lVarA = g0.a(aVar);
                aVar.t0(xVarH);
                return lVarA;
            } catch (Throwable th4) {
                aVar.t0(xVarH);
                throw th4;
            }
        } catch (OutOfMemoryError | StackOverflowError e15) {
            throw new p("Failed parsing JSON source: " + aVar + " to Json", e15);
        }
    }

    public static l d(String str) {
        return b(new StringReader(str));
    }

    @Deprecated
    public l a(String str) {
        return d(str);
    }
}
