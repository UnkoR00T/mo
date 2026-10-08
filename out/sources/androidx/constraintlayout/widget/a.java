package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import io.sentry.android.core.c2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f11374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0251a f11375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f11377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f11378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f11379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11380h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public enum EnumC0251a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0251a enumC0251a, Object obj, boolean z15) {
        this.f11374b = str;
        this.f11375c = enumC0251a;
        this.f11373a = z15;
        f(obj);
    }

    public static HashMap<String, a> a(HashMap<String, a> map, View view) {
        HashMap<String, a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e15) {
                c2.f("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e15);
            } catch (NoSuchMethodException e16) {
                c2.f("TransitionLayout", cls.getName() + " must have a method " + str, e16);
            } catch (InvocationTargetException e17) {
                c2.f("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e17);
            }
        }
        return map2;
    }

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        EnumC0251a enumC0251a;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.F4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0251a enumC0251a2 = null;
        boolean z15 = false;
        for (int i15 = 0; i15 < indexCount; i15++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i15);
            if (index == i.G4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == i.Q4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z15 = true;
            } else if (index == i.H4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0251a2 = EnumC0251a.BOOLEAN_TYPE;
            } else {
                if (index == i.J4) {
                    enumC0251a = EnumC0251a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.I4) {
                    enumC0251a = EnumC0251a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.N4) {
                    enumC0251a = EnumC0251a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == i.K4) {
                    enumC0251a = EnumC0251a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == i.L4) {
                    enumC0251a = EnumC0251a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == i.M4) {
                    enumC0251a = EnumC0251a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == i.P4) {
                    enumC0251a = EnumC0251a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == i.O4) {
                    enumC0251a = EnumC0251a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0251a2 = enumC0251a;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new a(string, enumC0251a2, objValueOf2, z15));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, a> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String str2 = aVar.f11373a ? str : "set" + str;
            try {
                int iOrdinal = aVar.f11375c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f11376d));
                        break;
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f11377e));
                        break;
                    case 2:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f11380h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f11380h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f11378f);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f11379g));
                        break;
                    case 6:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f11377e));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f11376d));
                        break;
                }
            } catch (IllegalAccessException e15) {
                c2.f("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e15);
            } catch (NoSuchMethodException e16) {
                c2.f("TransitionLayout", cls.getName() + " must have a method " + str2, e16);
            } catch (InvocationTargetException e17) {
                c2.f("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e17);
            }
        }
    }

    public String b() {
        return this.f11374b;
    }

    public EnumC0251a c() {
        return this.f11375c;
    }

    public void f(Object obj) {
        switch (this.f11375c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f11376d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f11377e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f11380h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f11378f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f11379g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f11377e = ((Float) obj).floatValue();
                break;
        }
    }

    public a(a aVar, Object obj) {
        this.f11373a = false;
        this.f11374b = aVar.f11374b;
        this.f11375c = aVar.f11375c;
        f(obj);
    }
}
