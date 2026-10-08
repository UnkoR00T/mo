package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.u;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class NumberTypeAdapter extends a0<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b0 f36738b = f(y.f36875b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f36739a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36741a;

        static {
            int[] iArr = new int[zl.b.values().length];
            f36741a = iArr;
            try {
                iArr[zl.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36741a[zl.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36741a[zl.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(z zVar) {
        this.f36739a = zVar;
    }

    public static b0 e(z zVar) {
        return zVar == y.f36875b ? f36738b : f(zVar);
    }

    private static b0 f(z zVar) {
        return new b0() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.b0
            public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
                if (aVar.c() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(zl.a aVar) throws IOException {
        zl.b bVarA0 = aVar.a0();
        int i15 = a.f36741a[bVarA0.ordinal()];
        if (i15 == 1) {
            aVar.O();
            return null;
        }
        if (i15 == 2 || i15 == 3) {
            return this.f36739a.b(aVar);
        }
        throw new u("Expecting number, got: " + bVarA0 + "; at path " + aVar.W());
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(zl.c cVar, Number number) throws IOException {
        cVar.C0(number);
    }
}
