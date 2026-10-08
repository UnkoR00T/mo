package nc4;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f;
import l70.c;
import l70.h;
import l70.i;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "isDarkTheme", "Ll70/c;", "a", "(Z)Ll70/c;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"nc4/b$a", "Ll70/c;", "Lnc4/a;", "a", "Lnc4/a;", "d", "()Lnc4/a;", "base", "La20/a;", "b", "La20/a;", "()La20/a;", f.f37063p, "Ll70/h;", "c", "Ll70/h;", "()Ll70/h;", "support", "Ll70/i;", "Ll70/i;", "getSurface", "()Ll70/i;", "surface", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final nc4.a base;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a20.a neutral;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final h support;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final i surface;

        a(boolean z15) {
            nc4.a aVar;
            a20.a aVar2;
            h hVar;
            i iVar;
            if (z15) {
                aVar = nc4.a.C3336a.f134224a;
            } else {
                if (z15) {
                    throw new p();
                }
                aVar = nc4.a.b.f134230a;
            }
            this.base = aVar;
            if (z15) {
                aVar2 = a20.a.C0025a.f2053a;
            } else {
                if (z15) {
                    throw new p();
                }
                aVar2 = a20.a.b.f2065a;
            }
            this.neutral = aVar2;
            if (z15) {
                hVar = h.a.f116736a;
            } else {
                if (z15) {
                    throw new p();
                }
                hVar = h.b.f116747a;
            }
            this.support = hVar;
            if (z15) {
                iVar = i.a.f116758a;
            } else {
                if (z15) {
                    throw new p();
                }
                iVar = i.b.f116763a;
            }
            this.surface = iVar;
        }

        @Override // l70.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public a20.a getNeutral() {
            return this.neutral;
        }

        @Override // l70.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public h getSupport() {
            return this.support;
        }

        @Override // l70.c
        /* JADX INFO: renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
        public nc4.a c() {
            return this.base;
        }

        @Override // l70.c
        public i getSurface() {
            return this.surface;
        }
    }

    public static final c a(boolean z15) {
        return new a(z15);
    }
}
