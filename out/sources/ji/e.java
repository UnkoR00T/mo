package ji;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.c41;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements c41 {

    public static abstract class a {
        @RecentlyNonNull
        public e a() {
            ii.k0 k0VarG = g();
            Integer numC = c();
            Integer numB = b();
            zj.p.e(k0VarG.i() != null, "To construct the FetchResolvedPhotoUriRequest, the provided PhotoMetadata must be fetched from Places API (New). You must first call initializeWithNewPlacesApiEnabled to initialize the PlaceClient and retrieve the PhotoMetadata. Once you have the PhotoMetadata, you must pass it into the FetchResolvedPhotoUriRequest.");
            if (numC != null) {
                zj.p.l(numC.intValue() > 0, "Max width must not be < 1, but was: %s.", numC);
                zj.p.j(numC.intValue() <= 4800, "Max width must not be > %s, but was: %s.", 4800, numC);
            }
            if (numB != null) {
                zj.p.l(numB.intValue() > 0, "Max height must not be < 1, but was: %s.", numB);
                zj.p.j(numB.intValue() <= 4800, "Max height must not be > %s, but was: %s.", 4800, numB);
            }
            if (numC == null && numB == null) {
                int iG = k0VarG.g();
                if (iG > 0) {
                    f(Integer.valueOf(Math.min(4800, iG)));
                }
                int iF = k0VarG.f();
                if (iF > 0) {
                    e(Integer.valueOf(Math.min(4800, iF)));
                }
            }
            zj.p.x((c() == null && b() == null) ? false : true, "Must include max width or max height in the request.");
            return h();
        }

        @RecentlyNullable
        public abstract Integer b();

        @RecentlyNullable
        public abstract Integer c();

        @RecentlyNonNull
        public abstract a d(vh.a aVar);

        @RecentlyNonNull
        public abstract a e(Integer num);

        @RecentlyNonNull
        public abstract a f(Integer num);

        abstract ii.k0 g();

        abstract e h();
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull ii.k0 k0Var) {
        z zVar = new z();
        zVar.i(k0Var);
        return zVar;
    }

    @Override // com.google.android.libraries.places.internal.c41
    @RecentlyNullable
    public abstract vh.a a();

    @RecentlyNullable
    public abstract Integer c();

    @RecentlyNullable
    public abstract Integer d();

    @RecentlyNonNull
    public abstract ii.k0 e();
}
