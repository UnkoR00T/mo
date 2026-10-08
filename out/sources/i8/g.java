package i8;

import java.util.Objects;
import l9.l;
import l9.s;
import t7.p;

/* JADX INFO: loaded from: classes3.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f89922a = new a();

    class a implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l9.h f89923b = new l9.h();

        a() {
        }

        @Override // i8.g
        public boolean a(p pVar) {
            String str = pVar.f188381p;
            return this.f89923b.a(pVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // i8.g
        public l b(p pVar) {
            String str = pVar.f188381p;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new m9.a(str, pVar.M, 16000L);
                    case "application/cea-708":
                        return new m9.c(pVar.M, pVar.f188384s);
                }
            }
            if (!this.f89923b.a(pVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            s sVarB = this.f89923b.b(pVar);
            return new b(sVarB.getClass().getSimpleName() + "Decoder", sVarB);
        }
    }

    boolean a(p pVar);

    l b(p pVar);
}
