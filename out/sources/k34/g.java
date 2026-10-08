package k34;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0006\f\u001c\u001d\u001e\u001f !R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0010\"#$%&'()*+,-./01¨\u00062À\u0006\u0003"}, d2 = {"Lk34/g;", "", "", "getName", "()I", "name", "b", "()Ljava/lang/Integer;", "nameAlternative", "getDescription", "description", "Lk34/s;", "a", "()Lk34/s;", "icons", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "h", "d", "o", "g", "c", "m", "n", "l", "k", "i", "j", "q", "p", "e", "f", "Lk34/g$a;", "Lk34/g$b;", "Lk34/g$c;", "Lk34/g$d;", "Lk34/g$e;", "Lk34/g$f;", "Lk34/g$g;", "Lk34/g$h;", "Lk34/g$i;", "Lk34/g$j;", "Lk34/g$k;", "Lk34/g$l;", "Lk34/g$m;", "Lk34/g$n;", "Lk34/g$o;", "Lk34/g$q;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$a;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.ADVOCATE_CARD;

        public a(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$b;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.DEPUTY_CARD;

        public b(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$c;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.DIIA_REFUGEE_CARD;

        public c(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lk34/g$d;", "Lk34/g;", "", "iconId", "name", "description", "<init>", "(III)V", "a", "I", "getName", "()I", "b", "getDescription", "()Ljava/lang/Integer;", "Lk34/s;", "c", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "d", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.DRIVING_LICENCE;

        public d(int i15, int i16, int i17) {
            this.name = i16;
            this.description = i17;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public Integer getDescription() {
            return Integer.valueOf(this.description);
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lk34/g$e;", "Lk34/g;", "", "name", "iconId", "Lrq0/b$b;", "dynamicDocumentType", "<init>", "(IILrq0/b$b;)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type;

        public e(int i15, int i16, rq0.b.EnumC4479b enumC4479b) {
            this.name = i15;
            this.icons = new Icons(i16);
            this.type = enumC4479b;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lk34/g$f;", "Lk34/g;", "", "name", "iconId", "Lrq0/b$c;", "dynamicMultiDocumentType", "<init>", "(IILrq0/b$c;)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type;

        public f(int i15, int i16, rq0.b.c cVar) {
            this.name = i15;
            this.icons = new Icons(i16);
            this.type = cVar;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    /* JADX INFO: renamed from: k34.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$g;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2571g implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.FAMILY_CARD;

        public C2571g(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$h;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.ID_CARD;

        public h(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$i;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.MIDWIFE_CARD;

        public i(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$j;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.NURSE_CARD;

        public j(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$k;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.PENSIONER_CARD;

        public k(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lk34/g$l;", "Lk34/g;", "", "iconId", "name", "nameAlternative", "<init>", "(IILjava/lang/Integer;)V", "a", "I", "getName", "()I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lk34/s;", "c", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "d", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Integer nameAlternative;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.RAILWAY_CARD;

        public l(int i15, int i16, Integer num) {
            this.name = i16;
            this.nameAlternative = num;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public Integer getNameAlternative() {
            return this.nameAlternative;
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$m;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.SCHOOL_CARD;

        public m(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk34/g$n;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "Lk34/s;", "b", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "c", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class n implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.STUDENT_CARD;

        public n(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lk34/g$o;", "Lk34/g;", "", "iconId", "name", "<init>", "(II)V", "a", "I", "getName", "()I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "nameAlternative", "Lk34/s;", "c", "Lk34/s;", "()Lk34/s;", "icons", "Lrq0/b;", "d", "Lrq0/b;", "getType", "()Lrq0/b;", "type", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class o implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Integer nameAlternative;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type = rq0.b.d.VEHICLE_CARD;

        public o(int i15, int i16) {
            this.name = i16;
            this.icons = new Icons(i15);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public Integer getNameAlternative() {
            return this.nameAlternative;
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lk34/g$p;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum p {
        SENATOR,
        PZPN_COACH,
        FAMILY,
        CITY,
        SENIOR,
        TOURIST,
        UNIVERSAL,
        CYCLING,
        FISHING;


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ wq.a f108030l = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lk34/g$q;", "Lk34/g;", "Lrq0/b;", "type", "", "name", "Lk34/g$p;", "wruCardType", "iconId", "<init>", "(Lrq0/b;ILk34/g$p;I)V", "a", "Lrq0/b;", "getType", "()Lrq0/b;", "b", "I", "getName", "()I", "c", "Lk34/g$p;", "getCardType", "()Lk34/g$p;", "cardType", "Lk34/s;", "d", "Lk34/s;", "()Lk34/s;", "icons", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class q implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final rq0.b type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final p cardType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Icons icons;

        public q(rq0.b bVar, int i15, p pVar, int i16) {
            this.type = bVar;
            this.name = i15;
            this.cardType = pVar;
            this.icons = new Icons(i16);
        }

        @Override // k34.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public Icons getIcons() {
            return this.icons;
        }

        @Override // k34.g
        /* JADX INFO: renamed from: b */
        public /* bridge */ Integer getNameAlternative() {
            return super.getNameAlternative();
        }

        @Override // k34.g
        public /* bridge */ Integer getDescription() {
            return super.getDescription();
        }

        @Override // k34.g
        public int getName() {
            return this.name;
        }

        @Override // k34.g
        public rq0.b getType() {
            return this.type;
        }
    }

    /* JADX INFO: renamed from: a */
    Icons getIcons();

    /* JADX INFO: renamed from: b */
    default Integer getNameAlternative() {
        return null;
    }

    default Integer getDescription() {
        return null;
    }

    int getName();

    rq0.b getType();
}
