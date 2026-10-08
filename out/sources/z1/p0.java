package z1;

import p071kotlin.Metadata;
import p079n1.c4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lz1/p0;", "", "Lz1/e1;", "layout", "Lz1/j0;", "a", "(Lz1/e1;)Lz1/j0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f232155a;

    /* JADX INFO: renamed from: z1.p0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lz1/p0$a;", "", "<init>", "()V", "Lz1/p0;", "b", "Lz1/p0;", "l", "()Lz1/p0;", "None", "c", "getCharacter", "Character", "d", "n", "Word", "e", "m", "Paragraph", "f", "k", "CharacterWithWordAccelerate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f232155a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final p0 None = new p0() { // from class: z1.k0
            @Override // z1.p0
            public final Selection a(e1 e1Var) {
                return p0.Companion.h(e1Var);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final p0 Character = new p0() { // from class: z1.l0
            @Override // z1.p0
            public final Selection a(e1 e1Var) {
                return p0.Companion.f(e1Var);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final p0 Word = new p0() { // from class: z1.m0
            @Override // z1.p0
            public final Selection a(e1 e1Var) {
                return p0.Companion.j(e1Var);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final p0 Paragraph = new p0() { // from class: z1.n0
            @Override // z1.p0
            public final Selection a(e1 e1Var) {
                return p0.Companion.i(e1Var);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final p0 CharacterWithWordAccelerate = new p0() { // from class: z1.o0
            @Override // z1.p0
            public final Selection a(e1 e1Var) {
                return p0.Companion.g(e1Var);
            }
        };

        /* JADX INFO: renamed from: z1.p0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C6231a implements n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C6231a f232161a = new C6231a();

            C6231a() {
            }

            @Override // z1.n
            public final long a(h0 h0Var, int i15) {
                return c4.c(h0Var.c(), i15);
            }
        }

        /* JADX INFO: renamed from: z1.p0$a$b */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f232162a = new b();

            b() {
            }

            @Override // z1.n
            public final long a(h0 h0Var, int i15) {
                return h0Var.getTextLayoutResult().C(i15);
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection f(e1 e1Var) {
            return s0.h(None.a(e1Var), e1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection g(e1 e1Var) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo anchorInfoL;
            Selection.AnchorInfo start;
            Selection.AnchorInfo end2;
            Selection selectionH = e1Var.h();
            if (selectionH == null) {
                return Word.a(e1Var);
            }
            if (e1Var.a()) {
                end = selectionH.getStart();
                anchorInfoL = s0.l(e1Var, e1Var.j(), end);
                end2 = selectionH.getEnd();
                start = anchorInfoL;
            } else {
                end = selectionH.getEnd();
                anchorInfoL = s0.l(e1Var, e1Var.i(), end);
                start = selectionH.getStart();
                end2 = anchorInfoL;
            }
            if (fr.t.c(anchorInfoL, end)) {
                return selectionH;
            }
            return s0.h(new Selection(start, end2, e1Var.e() == p.CROSSED || (e1Var.e() == p.COLLAPSED && start.getOffset() > end2.getOffset())), e1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection h(e1 e1Var) {
            return new Selection(e1Var.j().a(e1Var.j().getRawStartHandleOffset()), e1Var.i().a(e1Var.i().getRawEndHandleOffset()), e1Var.e() == p.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection i(e1 e1Var) {
            return s0.e(e1Var, C6231a.f232161a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection j(e1 e1Var) {
            return s0.e(e1Var, b.f232162a);
        }

        public final p0 k() {
            return CharacterWithWordAccelerate;
        }

        public final p0 l() {
            return None;
        }

        public final p0 m() {
            return Paragraph;
        }

        public final p0 n() {
            return Word;
        }
    }

    Selection a(e1 layout);
}
