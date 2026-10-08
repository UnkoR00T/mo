package fu;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u001dR\u0014\u0010!\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\"¨\u0006$"}, d2 = {"Lfu/m;", "Lfu/l;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "next", "()Lfu/l;", "a", "Ljava/util/regex/Matcher;", "b", "Ljava/lang/CharSequence;", "Lfu/k;", "c", "Lfu/k;", "()Lfu/k;", "groups", "", "", "d", "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "Llr/i;", "()Llr/i;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Matcher matcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CharSequence input;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k groups = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<String> groupValues_;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"fu/m$a", "Lpq/d;", "", "", "index", "get", "(I)Ljava/lang/String;", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends pq.d<String> {
        a() {
        }

        @Override // pq.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return h((String) obj);
            }
            return false;
        }

        @Override // pq.b
        /* JADX INFO: renamed from: f */
        public int getSize() {
            return m.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean h(String str) {
            return super.contains(str);
        }

        public /* bridge */ int i(String str) {
            return super.indexOf(str);
        }

        @Override // pq.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return i((String) obj);
            }
            return -1;
        }

        public /* bridge */ int k(String str) {
            return super.lastIndexOf(str);
        }

        @Override // pq.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return k((String) obj);
            }
            return -1;
        }

        @Override // pq.d, java.util.List
        public String get(int index) {
            String strGroup = m.this.f().group(index);
            return strGroup == null ? "" : strGroup;
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"fu/m$b", "", "Lpq/b;", "Lfu/j;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "get", "(I)Lfu/j;", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends pq.b<MatchGroup> implements k {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchGroup k(b bVar, int i15) {
            return bVar.get(i15);
        }

        @Override // pq.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return i((MatchGroup) obj);
            }
            return false;
        }

        @Override // pq.b
        /* JADX INFO: renamed from: f */
        public int getSize() {
            return m.this.f().groupCount() + 1;
        }

        @Override // fu.k
        public MatchGroup get(int index) {
            lr.i iVarH = p.h(m.this.f(), index);
            if (iVarH.t().intValue() >= 0) {
                return new MatchGroup(m.this.f().group(index), iVarH);
            }
            return null;
        }

        public /* bridge */ boolean i(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // pq.b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<MatchGroup> iterator() {
            return eu.k.H(pq.v.a0(pq.v.o(this)), new er.l() { // from class: fu.n
                @Override // er.l
                public final Object b(Object obj) {
                    return m.b.k(this.f67089a, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public m(Matcher matcher, CharSequence charSequence) {
        this.matcher = matcher;
        this.input = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult f() {
        return this.matcher;
    }

    @Override // fu.l
    public lr.i a() {
        return p.g(f());
    }

    @Override // fu.l
    /* JADX INFO: renamed from: b, reason: from getter */
    public k getGroups() {
        return this.groups;
    }

    @Override // fu.l
    public /* bridge */ l.b c() {
        return l.a.a(this);
    }

    @Override // fu.l
    public List<String> d() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new a();
        }
        return this.groupValues_;
    }

    @Override // fu.l
    public String getValue() {
        return f().group();
    }

    @Override // fu.l
    public l next() {
        int iEnd = f().end() + (f().end() == f().start() ? 1 : 0);
        if (iEnd <= this.input.length()) {
            return p.e(this.matcher.pattern().matcher(this.input), iEnd, this.input);
        }
        return null;
    }
}
