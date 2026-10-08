package cw3;

import er.l;
import fr.k;
import fr.t;
import java.util.Set;
import oq.i0;
import p071kotlin.Metadata;
import pq.e1;
import wx.d;
import wx.i;

/* JADX INFO: renamed from: cw3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001b\u0019\u0017B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Lcw3/a;", "", "Lcw3/a$b;", "requirements", "", "isUnderGuardianship", "Lcw3/a$a;", "maskType", "Lkotlin/Function1;", "Lwx/i$a;", "Loq/i0;", "onPhotoSelected", "<init>", "(Lcw3/a$b;ZLcw3/a$a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcw3/a$b;", "c", "()Lcw3/a$b;", "b", "Z", "d", "()Z", "Lcw3/a$a;", "()Lcw3/a$a;", "Ler/l;", "()Ler/l;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdentityPhotoData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhotoRequirements requirements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUnderGuardianship;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC0815a maskType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<i.Image, i0> onPhotoSelected;

    /* JADX INFO: renamed from: cw3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\r\u0006\u000e\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcw3/a$a;", "", "<init>", "()V", "", "Lcw3/a$c;", "b", "()Ljava/util/Set;", "validationRules", "Lcw3/a$a$c;", "a", "()Lcw3/a$a$c;", "eyeLinesPolicy", "c", "d", "Lcw3/a$a$a;", "Lcw3/a$a$b;", "Lcw3/a$a$d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC0815a {

        /* JADX INFO: renamed from: cw3.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcw3/a$a$a;", "Lcw3/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lcw3/a$c;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "validationRules", "Lcw3/a$a$c$b;", "c", "Lcw3/a$a$c$b;", "()Lcw3/a$a$c$b;", "eyeLinesPolicy", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0816a extends AbstractC0815a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0816a f38347a = new C0816a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final Set<c> validationRules = e1.i(c.DETECT_FACE, c.NO_SMILE, c.FACE_IN_MASK, c.PROPORTIONS, c.FACE_FACING_THE_LENS, c.NOT_TILTED_FACE, c.OPEN_EYES, c.SINGLE_PERSON);

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final c.Visible eyeLinesPolicy = new c.Visible(0.34f, 0.56f);

            private C0816a() {
                super(null);
            }

            @Override // cw3.IdentityPhotoData.AbstractC0815a
            public Set<c> b() {
                return validationRules;
            }

            @Override // cw3.IdentityPhotoData.AbstractC0815a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c.Visible a() {
                return eyeLinesPolicy;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0816a);
            }

            public int hashCode() {
                return 1854324720;
            }

            public String toString() {
                return "Adult";
            }
        }

        /* JADX INFO: renamed from: cw3.a$a$b */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcw3/a$a$b;", "Lcw3/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lcw3/a$c;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "validationRules", "Lcw3/a$a$c$a;", "c", "Lcw3/a$a$c$a;", "()Lcw3/a$a$c$a;", "eyeLinesPolicy", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends AbstractC0815a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f38350a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final Set<c> validationRules = e1.i(c.DETECT_FACE, c.FACE_IN_MASK, c.PROPORTIONS, c.SINGLE_PERSON);

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final c.C0817a eyeLinesPolicy = c.C0817a.f38353a;

            private b() {
                super(null);
            }

            @Override // cw3.IdentityPhotoData.AbstractC0815a
            public Set<c> b() {
                return validationRules;
            }

            @Override // cw3.IdentityPhotoData.AbstractC0815a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c.C0817a a() {
                return eyeLinesPolicy;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1856279378;
            }

            public String toString() {
                return "Child";
            }
        }

        /* JADX INFO: renamed from: cw3.a$a$c */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcw3/a$a$c;", "", "a", "b", "Lcw3/a$a$c$a;", "Lcw3/a$a$c$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface c {

            /* JADX INFO: renamed from: cw3.a$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcw3/a$a$c$a;", "Lcw3/a$a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0817a implements c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0817a f38353a = new C0817a();

                private C0817a() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0817a);
                }

                public int hashCode() {
                    return 261651971;
                }

                public String toString() {
                    return "NotVisible";
                }
            }

            /* JADX INFO: renamed from: cw3.a$a$c$b, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcw3/a$a$c$b;", "Lcw3/a$a$c;", "", "topEyeLineYPositionRatio", "bottomEyeLineYPositionRatio", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Visible implements c {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final float topEyeLineYPositionRatio;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final float bottomEyeLineYPositionRatio;

                public Visible(float f15, float f16) {
                    this.topEyeLineYPositionRatio = f15;
                    this.bottomEyeLineYPositionRatio = f16;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final float getBottomEyeLineYPositionRatio() {
                    return this.bottomEyeLineYPositionRatio;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final float getTopEyeLineYPositionRatio() {
                    return this.topEyeLineYPositionRatio;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Visible)) {
                        return false;
                    }
                    Visible visible = (Visible) other;
                    return Float.compare(this.topEyeLineYPositionRatio, visible.topEyeLineYPositionRatio) == 0 && Float.compare(this.bottomEyeLineYPositionRatio, visible.bottomEyeLineYPositionRatio) == 0;
                }

                public int hashCode() {
                    return (Float.hashCode(this.topEyeLineYPositionRatio) * 31) + Float.hashCode(this.bottomEyeLineYPositionRatio);
                }

                public String toString() {
                    return "Visible(topEyeLineYPositionRatio=" + this.topEyeLineYPositionRatio + ", bottomEyeLineYPositionRatio=" + this.bottomEyeLineYPositionRatio + ")";
                }
            }
        }

        /* JADX INFO: renamed from: cw3.a$a$d */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcw3/a$a$d;", "Lcw3/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lcw3/a$c;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "validationRules", "Lcw3/a$a$c$b;", "c", "Lcw3/a$a$c$b;", "()Lcw3/a$a$c$b;", "eyeLinesPolicy", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends AbstractC0815a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f38356a = new d();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final Set<c> validationRules = e1.i(c.DETECT_FACE, c.NO_SMILE, c.FACE_IN_MASK, c.PROPORTIONS, c.FACE_FACING_THE_LENS, c.NOT_TILTED_FACE, c.OPEN_EYES, c.SINGLE_PERSON);

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final c.Visible eyeLinesPolicy = new c.Visible(0.34f, 0.66f);

            private d() {
                super(null);
            }

            @Override // cw3.IdentityPhotoData.AbstractC0815a
            public Set<c> b() {
                return validationRules;
            }

            @Override // cw3.IdentityPhotoData.AbstractC0815a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c.Visible a() {
                return eyeLinesPolicy;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1445856740;
            }

            public String toString() {
                return "Teen";
            }
        }

        public /* synthetic */ AbstractC0815a(k kVar) {
            this();
        }

        public abstract c a();

        public abstract Set<c> b();

        private AbstractC0815a() {
        }
    }

    /* JADX INFO: renamed from: cw3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcw3/a$b;", "", "Lxw/a;", "maxSize", "", "Lwx/d;", "allowedExtensions", "Lcw3/a$b$a;", "minResolution", "<init>", "(FLjava/util/Set;Lcw3/a$b$a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "Ljava/util/Set;", "()Ljava/util/Set;", "c", "Lcw3/a$b$a;", "()Lcw3/a$b$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhotoRequirements {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxSize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<d> allowedExtensions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Resolution minResolution;

        /* JADX INFO: renamed from: cw3.a$b$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcw3/a$b$a;", "", "", "shortSide", "longSide", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Resolution {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int shortSide;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int longSide;

            public Resolution(int i15, int i16) {
                this.shortSide = i15;
                this.longSide = i16;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getLongSide() {
                return this.longSide;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getShortSide() {
                return this.shortSide;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Resolution)) {
                    return false;
                }
                Resolution resolution = (Resolution) other;
                return this.shortSide == resolution.shortSide && this.longSide == resolution.longSide;
            }

            public int hashCode() {
                return (Integer.hashCode(this.shortSide) * 31) + Integer.hashCode(this.longSide);
            }

            public String toString() {
                return "Resolution(shortSide=" + this.shortSide + ", longSide=" + this.longSide + ")";
            }
        }

        public /* synthetic */ PhotoRequirements(float f15, Set set, Resolution resolution, k kVar) {
            this(f15, set, resolution);
        }

        public final Set<d> a() {
            return this.allowedExtensions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getMaxSize() {
            return this.maxSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Resolution getMinResolution() {
            return this.minResolution;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoRequirements)) {
                return false;
            }
            PhotoRequirements photoRequirements = (PhotoRequirements) other;
            return xw.a.d(this.maxSize, photoRequirements.maxSize) && t.c(this.allowedExtensions, photoRequirements.allowedExtensions) && t.c(this.minResolution, photoRequirements.minResolution);
        }

        public int hashCode() {
            return (((xw.a.e(this.maxSize) * 31) + this.allowedExtensions.hashCode()) * 31) + this.minResolution.hashCode();
        }

        public String toString() {
            return "PhotoRequirements(maxSize=" + xw.a.f(this.maxSize) + ", allowedExtensions=" + this.allowedExtensions + ", minResolution=" + this.minResolution + ")";
        }

        private PhotoRequirements(float f15, Set<d> set, Resolution resolution) {
            this.maxSize = f15;
            this.allowedExtensions = set;
            this.minResolution = resolution;
        }
    }

    /* JADX INFO: renamed from: cw3.a$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcw3/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        DETECT_FACE,
        FACE_IN_MASK,
        PROPORTIONS,
        FACE_FACING_THE_LENS,
        NOT_TILTED_FACE,
        NO_SMILE,
        OPEN_EYES,
        SINGLE_PERSON;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ wq.a f38373k = wq.b.a(b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdentityPhotoData(PhotoRequirements photoRequirements, boolean z15, AbstractC0815a abstractC0815a, l<? super i.Image, i0> lVar) {
        this.requirements = photoRequirements;
        this.isUnderGuardianship = z15;
        this.maskType = abstractC0815a;
        this.onPhotoSelected = lVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC0815a getMaskType() {
        return this.maskType;
    }

    public final l<i.Image, i0> b() {
        return this.onPhotoSelected;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PhotoRequirements getRequirements() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsUnderGuardianship() {
        return this.isUnderGuardianship;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityPhotoData)) {
            return false;
        }
        IdentityPhotoData identityPhotoData = (IdentityPhotoData) other;
        return t.c(this.requirements, identityPhotoData.requirements) && this.isUnderGuardianship == identityPhotoData.isUnderGuardianship && t.c(this.maskType, identityPhotoData.maskType) && t.c(this.onPhotoSelected, identityPhotoData.onPhotoSelected);
    }

    public int hashCode() {
        return (((((this.requirements.hashCode() * 31) + Boolean.hashCode(this.isUnderGuardianship)) * 31) + this.maskType.hashCode()) * 31) + this.onPhotoSelected.hashCode();
    }

    public String toString() {
        return "IdentityPhotoData(requirements=" + this.requirements + ", isUnderGuardianship=" + this.isUnderGuardianship + ", maskType=" + this.maskType + ", onPhotoSelected=" + this.onPhotoSelected + ")";
    }
}
