package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a7.b f12319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f12320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f12321c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f12322d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f12323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f12324b;

        private a() {
            this(1);
        }

        a a(int i15) {
            SparseArray<a> sparseArray = this.f12323a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i15);
        }

        final o b() {
            return this.f12324b;
        }

        void c(o oVar, int i15, int i16) {
            a aVarA = a(oVar.b(i15));
            if (aVarA == null) {
                aVarA = new a();
                this.f12323a.put(oVar.b(i15), aVarA);
            }
            if (i16 > i15) {
                aVarA.c(oVar, i15 + 1, i16);
            } else {
                aVarA.f12324b = oVar;
            }
        }

        a(int i15) {
            this.f12323a = new SparseArray<>(i15);
        }
    }

    private m(Typeface typeface, a7.b bVar) {
        this.f12322d = typeface;
        this.f12319a = bVar;
        this.f12320b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(a7.b bVar) {
        int iK = bVar.k();
        for (int i15 = 0; i15 < iK; i15++) {
            o oVar = new o(this, i15);
            Character.toChars(oVar.f(), this.f12320b, i15 * 2);
            h(oVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            e6.l.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            e6.l.b();
        }
    }

    public char[] c() {
        return this.f12320b;
    }

    public a7.b d() {
        return this.f12319a;
    }

    int e() {
        return this.f12319a.l();
    }

    a f() {
        return this.f12321c;
    }

    Typeface g() {
        return this.f12322d;
    }

    void h(o oVar) {
        i6.i.h(oVar, "emoji metadata cannot be null");
        i6.i.b(oVar.c() > 0, "invalid metadata codepoint length");
        this.f12321c.c(oVar, 0, oVar.c() - 1);
    }
}
