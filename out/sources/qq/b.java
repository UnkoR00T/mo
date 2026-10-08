package qq;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.k;
import fr.t;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p071kotlin.Metadata;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\"\b\u0000\u0018\u0000 a*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003Y\\VB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0017¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b0\u0010)J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016¢\u0006\u0004\b8\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020$H\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020$H\u0002¢\u0006\u0004\bD\u0010,J\u0017\u0010F\u001a\u00020$2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u000bJ\u0017\u0010\u0001\u001a\u00020$2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0001\u0010\u000bJ\u001b\u0010H\u001a\u00020\u000f2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020$2\u0006\u0010J\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020$2\u0006\u0010J\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010%J-\u0010N\u001a\u00020$2\u0006\u0010J\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00028\u00002\u0006\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bP\u0010\u0014J\u001f\u0010S\u001a\u00020$2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bS\u0010LJ5\u00105\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010T\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010UR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010?¨\u0006b"}, d2 = {"Lqq/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lpq/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "A", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Loq/i0;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "f", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "M", "B", "n", "G", "minCapacity", "C", "(Ljava/util/List;)Z", "i", i.f37094u, "(II)V", "w", "v", "(ILjava/util/Collection;I)V", "Q", "rangeOffset", "rangeLength", "R", "retain", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "backing", "b", "I", "length", "c", "Z", "isReadOnly", "e", "size", "d", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<E> extends pq.h<E> implements List<E>, RandomAccess, Serializable, gr.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4243b f168010d = new C4243b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f168011e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private E[] backing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001WBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0017¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010/J\u000f\u0010G\u001a\u00020'H\u0002¢\u0006\u0004\bG\u0010/J\u001b\u0010I\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\b\u00030HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\bL\u0010(J-\u0010N\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010M\u001a\u00020\nH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bP\u0010\u0017J\u001f\u0010S\u001a\u00020'2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010TJ5\u0010\u0001\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010U\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0001\u0010VR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010AR\u0014\u0010b\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0014¨\u0006c"}, d2 = {"Lqq/b$a;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lpq/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lqq/b;", "root", "<init>", "([Ljava/lang/Object;IILqq/b$a;Lqq/b;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Loq/i0;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "f", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "A", "t", "u", "", "v", "(Ljava/util/List;)Z", "i", "s", "n", "o", "(ILjava/util/Collection;I)V", "B", "rangeOffset", "rangeLength", "C", "(II)V", "retain", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "b", "I", "c", "d", "Lqq/b$a;", "e", "Lqq/b;", "size", "w", "isReadOnly", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<E> extends pq.h<E> implements List<E>, RandomAccess, Serializable, gr.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private E[] backing;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int offset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final a<E> parent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final b<E> root;

        /* JADX INFO: renamed from: qq.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lqq/b$a$a;", "E", "", "Lqq/b$a;", "list", "", "index", "<init>", "(Lqq/b$a;I)V", "Loq/i0;", "a", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lqq/b$a;", "b", "I", "c", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        private static final class C4242a<E> implements ListIterator<E>, gr.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final a<E> list;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int index;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int lastIndex = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int expectedModCount;

            public C4242a(a<E> aVar, int i15) {
                this.list = aVar;
                this.index = i15;
                this.expectedModCount = ((AbstractList) aVar).modCount;
            }

            private final void a() {
                if (((AbstractList) ((a) this.list).root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                a();
                a<E> aVar = this.list;
                int i15 = this.index;
                this.index = i15 + 1;
                aVar.add(i15, element);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < ((a) this.list).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                a();
                if (this.index >= ((a) this.list).length) {
                    throw new NoSuchElementException();
                }
                int i15 = this.index;
                this.index = i15 + 1;
                this.lastIndex = i15;
                return (E) ((a) this.list).backing[((a) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public E previous() {
                a();
                int i15 = this.index;
                if (i15 <= 0) {
                    throw new NoSuchElementException();
                }
                int i16 = i15 - 1;
                this.index = i16;
                this.lastIndex = i16;
                return (E) ((a) this.list).backing[((a) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i15 = this.lastIndex;
                if (i15 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.f(i15);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                a();
                int i15 = this.lastIndex;
                if (i15 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i15, element);
            }
        }

        public a(E[] eArr, int i15, int i16, a<E> aVar, b<E> bVar) {
            this.backing = eArr;
            this.offset = i15;
            this.length = i16;
            this.parent = aVar;
            this.root = bVar;
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }

        private final void A() {
            ((AbstractList) this).modCount++;
        }

        private final E B(int i15) {
            A();
            a<E> aVar = this.parent;
            E eB = aVar != null ? aVar.B(i15) : (E) this.root.Q(i15);
            this.length--;
            return eB;
        }

        private final void C(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                A();
            }
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.C(rangeOffset, rangeLength);
            } else {
                this.root.R(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        private final int E(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            a<E> aVar = this.parent;
            int iE = aVar != null ? aVar.E(rangeOffset, rangeLength, elements, retain) : this.root.T(rangeOffset, rangeLength, elements, retain);
            if (iE > 0) {
                A();
            }
            this.length -= iE;
            return iE;
        }

        private final void o(int i15, Collection<? extends E> elements, int n15) {
            A();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.o(i15, elements, n15);
            } else {
                this.root.v(i15, elements, n15);
            }
            this.backing = (E[]) ((b) this.root).backing;
            this.length += n15;
        }

        private final void s(int i15, E element) {
            A();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.s(i15, element);
            } else {
                this.root.w(i15, element);
            }
            this.backing = (E[]) ((b) this.root).backing;
            this.length++;
        }

        private final void t() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void u() {
            if (w()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean v(List<?> other) {
            return qq.c.h(this.backing, this.offset, this.length, other);
        }

        private final boolean w() {
            return ((b) this.root).isReadOnly;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            u();
            t();
            s(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            u();
            t();
            int size = elements.size();
            o(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            u();
            t();
            C(this.offset, this.length);
        }

        @Override // pq.h
        /* JADX INFO: renamed from: e */
        public int getSize() {
            t();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            t();
            if (other != this) {
                return (other instanceof List) && v((List) other);
            }
            return true;
        }

        @Override // pq.h
        public E f(int index) {
            u();
            t();
            pq.d.INSTANCE.b(index, this.length);
            return B(this.offset + index);
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            t();
            pq.d.INSTANCE.b(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            t();
            return qq.c.i(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            t();
            for (int i15 = 0; i15 < this.length; i15++) {
                if (t.c(this.backing[this.offset + i15], element)) {
                    return i15;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            t();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            t();
            for (int i15 = this.length - 1; i15 >= 0; i15--) {
                if (t.c(this.backing[this.offset + i15], element)) {
                    return i15;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            u();
            t();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                f(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> elements) {
            u();
            t();
            return E(this.offset, this.length, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> elements) {
            u();
            t();
            return E(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            u();
            t();
            pq.d.INSTANCE.b(index, this.length);
            E[] eArr = this.backing;
            int i15 = this.offset;
            E e15 = eArr[i15 + index];
            eArr[i15 + index] = element;
            return e15;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            pq.d.INSTANCE.d(fromIndex, toIndex, this.length);
            return new a(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            t();
            int length = array.length;
            int i15 = this.length;
            if (length < i15) {
                E[] eArr = this.backing;
                int i16 = this.offset;
                return (T[]) Arrays.copyOfRange(eArr, i16, i15 + i16, array.getClass());
            }
            E[] eArr2 = this.backing;
            int i17 = this.offset;
            n.n(eArr2, array, 0, i17, i15 + i17);
            return (T[]) v.f(this.length, array);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            t();
            return qq.c.j(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            t();
            pq.d.INSTANCE.c(index, this.length);
            return new C4242a(this, index);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            u();
            t();
            pq.d.INSTANCE.c(index, this.length);
            s(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> elements) {
            u();
            t();
            pq.d.INSTANCE.c(index, this.length);
            int size = elements.size();
            o(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            t();
            E[] eArr = this.backing;
            int i15 = this.offset;
            return n.v(eArr, i15, this.length + i15);
        }
    }

    /* JADX INFO: renamed from: qq.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqq/b$b;", "", "<init>", "()V", "Lqq/b;", "", "Empty", "Lqq/b;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class C4243b {
        public /* synthetic */ C4243b(k kVar) {
            this();
        }

        private C4243b() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lqq/b$c;", "E", "", "Lqq/b;", "list", "", "index", "<init>", "(Lqq/b;I)V", "Loq/i0;", "a", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lqq/b;", "b", "I", "c", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class c<E> implements ListIterator<E>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b<E> list;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int lastIndex = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public c(b<E> bVar, int i15) {
            this.list = bVar;
            this.index = i15;
            this.expectedModCount = ((AbstractList) bVar).modCount;
        }

        private final void a() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            a();
            b<E> bVar = this.list;
            int i15 = this.index;
            this.index = i15 + 1;
            bVar.add(i15, element);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((b) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            if (this.index >= ((b) this.list).length) {
                throw new NoSuchElementException();
            }
            int i15 = this.index;
            this.index = i15 + 1;
            this.lastIndex = i15;
            return (E) ((b) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i15 = this.index;
            if (i15 <= 0) {
                throw new NoSuchElementException();
            }
            int i16 = i15 - 1;
            this.index = i16;
            this.lastIndex = i16;
            return (E) ((b) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i15 = this.lastIndex;
            if (i15 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.f(i15);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            a();
            int i15 = this.lastIndex;
            if (i15 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i15, element);
        }
    }

    static {
        b bVar = new b(0);
        bVar.isReadOnly = true;
        f168011e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    private final void B() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean C(List<?> other) {
        return qq.c.h(this.backing, 0, this.length, other);
    }

    private final void E(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) qq.c.e(this.backing, pq.d.INSTANCE.e(eArr.length, minCapacity));
        }
    }

    private final void G(int n15) {
        E(this.length + n15);
    }

    private final void L(int i15, int n15) {
        G(n15);
        E[] eArr = this.backing;
        n.n(eArr, eArr, i15 + n15, i15, this.length);
        this.length += n15;
    }

    private final void M() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E Q(int i15) {
        M();
        E[] eArr = this.backing;
        E e15 = eArr[i15];
        n.n(eArr, eArr, i15, i15 + 1, this.length);
        qq.c.f(this.backing, this.length - 1);
        this.length--;
        return e15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            M();
        }
        E[] eArr = this.backing;
        n.n(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i15 = this.length;
        qq.c.g(eArr2, i15 - rangeLength, i15);
        this.length -= rangeLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int T(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        int i15 = 0;
        int i16 = 0;
        while (i15 < rangeLength) {
            int i17 = rangeOffset + i15;
            if (elements.contains(this.backing[i17]) == retain) {
                E[] eArr = this.backing;
                i15++;
                eArr[i16 + rangeOffset] = eArr[i17];
                i16++;
            } else {
                i15++;
            }
        }
        int i18 = rangeLength - i16;
        E[] eArr2 = this.backing;
        n.n(eArr2, eArr2, rangeOffset + i16, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i19 = this.length;
        qq.c.g(eArr3, i19 - i18, i19);
        if (i18 > 0) {
            M();
        }
        this.length -= i18;
        return i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i15, Collection<? extends E> elements, int n15) {
        M();
        L(i15, n15);
        Iterator<? extends E> it = elements.iterator();
        for (int i16 = 0; i16 < n15; i16++) {
            this.backing[i15 + i16] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i15, E element) {
        M();
        L(i15, 1);
        this.backing[i15] = element;
    }

    public final List<E> A() {
        B();
        this.isReadOnly = true;
        return this.length > 0 ? this : f168011e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        B();
        w(this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        B();
        int size = elements.size();
        v(this.length, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        B();
        R(0, this.length);
    }

    @Override // pq.h
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof List) && C((List) other);
        }
        return true;
    }

    @Override // pq.h
    public E f(int index) {
        B();
        pq.d.INSTANCE.b(index, this.length);
        return Q(index);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        pq.d.INSTANCE.b(index, this.length);
        return this.backing[index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return qq.c.i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i15 = 0; i15 < this.length; i15++) {
            if (t.c(this.backing[i15], element)) {
                return i15;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i15 = this.length - 1; i15 >= 0; i15--) {
            if (t.c(this.backing[i15], element)) {
                return i15;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        B();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            f(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        B();
        return T(0, this.length, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        B();
        return T(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        B();
        pq.d.INSTANCE.b(index, this.length);
        E[] eArr = this.backing;
        E e15 = eArr[index];
        eArr[index] = element;
        return e15;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        pq.d.INSTANCE.d(fromIndex, toIndex, this.length);
        return new a(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        int length = array.length;
        int i15 = this.length;
        if (length < i15) {
            return (T[]) Arrays.copyOfRange(this.backing, 0, i15, array.getClass());
        }
        n.n(this.backing, array, 0, 0, i15);
        return (T[]) v.f(this.length, array);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return qq.c.j(this.backing, 0, this.length, this);
    }

    public b(int i15) {
        this.backing = (E[]) qq.c.d(i15);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        pq.d.INSTANCE.c(index, this.length);
        return new c(this, index);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        B();
        pq.d.INSTANCE.c(index, this.length);
        w(index, element);
    }

    public /* synthetic */ b(int i15, int i16, k kVar) {
        this((i16 & 1) != 0 ? 10 : i15);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        B();
        pq.d.INSTANCE.c(index, this.length);
        int size = elements.size();
        v(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return n.v(this.backing, 0, this.length);
    }
}
