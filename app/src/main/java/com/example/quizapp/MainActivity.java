package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.quizapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<CategoryModel> categories=new ArrayList<>();
        categories.add(new CategoryModel("","MATHEMATICS","data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAADICAMAAACahl6sAAABJlBMVEUzTlz///8kQUiWqtfvVXir0FXuyTHzVXkcQEYuSlYfO0cfPUKgs+McPEj/Vnw/WWq23FYQP0PzzDD/1S4rR1YqSF0qTVpEY0pSaoJtdE9ia0BUYUJtUGVObkxURlOpzlRjR1bOUXBcfU1Tc0xogJ3m6eszQksOLja+xsvbU3O9qDbO1dgjQE8oRU2nmDkUNkkrRkelsbeImKB5i5RgdX9TanVsf4kXNj1id3yhrrSGlZ60vsM6VGHY3uBJYW5+lLm74Va9UGwhQmBibVFydT/bvDOZkDoNMUpgT2OEp1FzlU80T1VHX2RUa3BLRFCOsVJSYlSSjUa5pjzNszQ1TUZ+fj5bZkEySkVCVkRpcD+Mn8hfd5OwUm6aTWOewlR9oFA7WkqESl7pQYUkAAANq0lEQVR4nM3djVfaVhsA8BgrjkTEhohurNp2MhCCKAIphdpZFTvR+larc127j///n3hvEgL5uLn3eZIL5Dln56ysmvz23O97SaSl2UU5FDO8mDSD31muV49arXb7JC8ZnpDyJ+12q3VUrc8CJBpSPzpud/IDw9B1PatLviAf6LphDPKd9vFRXfCFRULqrQ65WxISJ5y/02mJxAiClOu9tm7wCX6Oobd7osqZEEi1ZSkwiAmGWFpVEfeQHFJ+2xngUhFMzKDzNnlaEkLK/TyyQNEtRr6f0JIIUm8N4pUoisUYJKv7CSDV7sAQo3DCGHQT1JbYkGpHEpSMaehSJzYlJqR/IqpMBSjGSX+OkGp3NgyHEq+AxYC864ovVD6K1H03D0hrdtmYUIzWzCGkcsyaYQW+quAg5W7y3g8Wut7F9ZAoSD8/J4ZNyaOSgoCU20p2fg5JyiptRFLgkOo80+GEnoe3xGBIa7ZtboREAjdfUMjJAhg25UQopD5YkINIBrBBMQjSW5zDkvREQd7Oq/OIkOhvhUDK3bn05awwAJ0jH9JeuINI2okh5c5Ci5UbeoeXEw6kvKhmNxj6CUfChrxLi8OSsCcpTEhq8mEFJycsSKocPAkLko56Pg29EwtSbqfMQSSMcX00ZPH9YDiMLh7SSqGDSCKH9VGQXurKlRN61AgyArLAcTs7Ikf1EZC0OiwJBpKuDsQfEXNGKuRtih1EQp2e0CDVRd8qL2hrKxRIykYm4aCOVSiQ9PXowdAp86wwpK+AflmWGayf3GQG6OJKeDU1BCmfANZFs7q0zYp8thHxWzY/bP7vR0acSR8Almy4cIUgXX7Bykrb75c58X5bolA2pbNaRmNGpnYGSIseGnQFIX1ABdl+v8ZzLC+vEUrIcVYraBlOaIXaj/yb0IOFKwjht1iNPb7Cib1ATjY/Z7gMm5IZfuBCgt1iAMIf82b3AOlwJQ3vT34YaiCHlZTPXElwHOyHvOOP3RGO5bW/PDnZ/FyAMawoDLklw3jHgHBrenYbzrBieyLZPIOVK7d0PfJqfKC++yD8sUmW21z54/0EMrpDOIikxi8c1UgIICGIgmXFWl52fnLzDOUgheuRJ/GnxAvpc/8nNJAJWV7bU2U7KZsHSIhWu2xw7sboR0AAg0WkY3n5qyo7kgskJJORZY7E1wR7IFV+04us6lZKGrIt2fQ2WZNenPFJRivleBKjSoXwd23jQPIkJXJj88wDuTgYx+Se3U/uvJCfcryceFfsphDAdCo2RDZ8kMfLphWX5+MPtXPng+ZQC0B4OalSIJDRYmxIruSBaBeH1j3KcvNec+q188fcubeKOBC2xNNwTSD1wSwz4oNYLZJz5yWrVmgFx5X74usyxxC2ZLo4NIFAVhZFQTKFB+cmlQcL8mfT/ivKva9hcyFMyXTE5ULKgISIg2iZkpOEw3tNO3DuNxcYi00gTMmgHIDwO0OREFK4nOKkPBYunux/az4GxmJTCEsy6RRdCGhpURyEDG8Vp74fjAvWl2CP6YEwJJOFxzGkDFp7FwghY6mmU6KcW23eBf+CF8KQGGUfBLa2GISs0QII0S7+8Nxo8zw0WfFBoiXuuuMYAttlC0DW9qgBg2S0u+mN5p7CkxU/JFLi9u4OpApps8IQ2VRDYTbWYJCM9uDeae6wFh5SBiCRkkHVA2nBFheDkKwqh0LNgiGZJ/dWh5ShcRASJdFbUwh031MsJFOoOfVdPryHQCIk4x1SG1IHrvYKhmiP41vNlSjz+TAkSlKfQHrAjU/BReuz4v5Q7gEEoUuM3gQCXX8XWtm12rT9zeXChYsGoUqctXkbAj3OG+xHkjW/T54bzX3h9CMsSdaF1KFb6qGePUGHWDhvem+w+WcwJXQITWLUxxDw2QCRY61xi9Ucno/vN7jMEgGhSOyxvATu1oVCNHfMW9Luvzgj+qeLyNEvR2J37hYEyBAKcQpW7o/pfER5BEIoOXEg9flD3EF8bliwxsHOHy6HBRgkLKnbkKO5Q7SMM3pXSppdzMZrD/I9bc4OkRzZkGPwLq4oiDsXuXSqRWE4XovwTRJZENnfYejHNgS+HS1qOeihad1jrnngfviTU2OaD1CIPydWlyhhTvaKgWi1L/IhCfmnySf3T/Ynh97hPBviy4l1KlgCLWiJzcjFXc0OT3t773xydw+G+HIyqBMIcFJlQ/J4iHtdb9GKXsT2fvTEhnglZHIlLR0hzvxl0ZCv46vm8NsKCpPhK13GEYFgDi/G2uixQxlSJiSs0GpNNsMrIYMUCTrNdTKC3Xpbzo8hZO6Ei0KJU7K8Et2C4A4D4VKytje9KG7vTavxGfKknpD2FwnBtlv5yRySOp2NdmQgCZnkxIKATgN5AnyAw0rItmcurITX4BiQzzDHWJI9KUtl5PckEUc4JjXdieaQf6JmzCgMc1CIXbr0PIGgGCQaf0Eh24G1ieY59FDNwyWUMZYQBmz52peT/PvghJaSjeW9fGiNRSkdZHhZIZ3iXYnf8nojay1lx4BI2Wx+7yt1AXsSX/fyMmWtKCeXhhcFZlwclA7BxWoiiQchxUuV1TwjZFmlMGwKKfwlRuRkeO3wSOJCpKx1q9HBvmyOEXiEHUpciCVJU1RiQyTacuniIgEkXTlJAkmVJAmkWCz+EBXsqyqMmDOkSP75SGInImQ5CqOQdmmLEYdyLg4mHqQoffy2v86M/e87MoWiyFtXf/+2wYq//9k6xFNiQYofT1dXV58xY3V99dunkETZ+mdlY4UTGxu/b6EllRiDxuL3ZxzF2PLs5XP/1Zq/7HIZduxeYQaNduCH8cXv6yCHlZXvPknz6jcQw8rKFS4n6qiMnlj9B2RYsf7SU7qUX8AOS4KG4Ka6xY+wcuWWrp2JRNnahTtI6ULVE/MGvfhwinAQybfpxf6B1Q83JbeYjNgQzHJQ8eM6xkEkbkqULQyDxG+YlJjHyAW6Ii4hpJZ8H0NyV6iEkLhFTBPNFnLJtIipIXZG9t1K8jfSsbKCyEilh1vELn6kO1btoKfEvRaiyRrHv3BJo4rbVij+jEwIgTj9u7KFLVkrKy/AEHVUx2300CGr+5+sgeLLfdp/XN+ZB+S6jNt6i4C8em4N3X9dHIS0vrjN0EiI9dsWCekit6dFQaIH8fEgcg95YEAQZPd11LTq9W48SB15hEMUZKtJn+c2t2JCsIdqhEEiblGJB1GvscecUgoxW9iDZ37I6jjWJxA35gyp1LFHAf2Q/VdO7J86kNNX7gdzriMq+nCmF7L67NNzN5zfN/njJ8/Qkgq5eh0RV3EgVneIPC7rh+xELF39sMOBCO5HKtPjstADzKIgsIBC1OkBZuiR8lRCzJvpkXLodDeVRcv0HPKHTq5SWdkbffwXYejN76tvi2x+7W4d+9WkNHaI5nGML4ulcYhS8X9ZDPb1vRRC1NGSHwL6QmUKh/GV4BcqQV9xFQW5evELNV7gW61G8CuuoLG8qKnubmSsICFm6EvHoOWt9C0+NMJfA4d8MT91y0Hmm6UwBPCohPQt0PUpEEDvHmfJdJYQt1cPQPiPE0mwiK3gIfwNkkqfCoE84AW/reBeFL+twC1Xk84wCOF3ivE3epQZbPRUjiIg/IYrydYbErLBLVmeJisI4TdcyJSsnv7qXvbwd5zjlt9mRT+WCpCSn+e1Pf2CdyrQnxD8o9u+IwrX+n/eAwOvUQcG+E0W69FtgBEX4gjHqv8IxyW8vm9ccWu6yXyYHqQJhh+q+S+wOqFcwQ7VbOzyHb6mlwaBPHDy59N17jGn1fXT8DEneesWULw2brn1g0COOBDQ2DG7czqZsdPj2WnUwbNbnuN2C3CGLlDTaRDQaaHic/nTS0Z8+uF51FHApvLvC0b8KzcBY0V1xH8oK+wxuVk58mAm93Qm62wm8HRmBfCYXODa/ELPyjrr71wI8FHSi3NQClaSh3svMCfAh3uDH4m0IIa7tgiAAB+AvxiJeU295USvJFiExAx26WwI8CUR85eojYg3CyZ8bcfcJSbytR3gUwRzltArOhMCfbXNXCXhIRYAAn7o1hwdN3FeNgQ+bDM3iXnNeJGViBdyzUli0kYmIEi6JGyHoJfWzUFijhK8tC5FOeHkgwsBnwqesYRZz0EQ8Ks29Zk6GO0uGAJ9+ekMc2K+EfHyU/jraGfEUKPHJUgI9AXBs8mJ2RD2guCFjurNEeyN4GJfoi1eEjEfjA8BvtZcsESVIdUDBwG+aF6oBFqscBAyrlcgr7gSxlAr/N4jFmRpqQ9KiiCHOQqvi4qCkM4R0KUIyYkK6QTjQ0hSTvj9vACJOQruf4iGWKsS/PeUJGVUIl/WKhCy9K7LbYkTSUz5DXvqIQpCWuIuLyvxJWrlDaqSJ4LYVYVNiSlRK+jKkQxCstJhF7A4ElO+jpWNRBCrgA1YLRhaYjbiFarEEDIobg0YJQwlUSuNVsQ7jOcAIT1kP29E9pFgiWpWRn1c/ycaYlnedgYRFpDENBvXxwkVQiAkqq22Ti1jXIlZUW9aCWrGNIRASFrqPcsSwrAkqqXo1ZMnww5BEDvqrY4k6bqPQ5OoqmmqcuM6We0OhEiIFfWj43YnPzBIdvSs7pdYANOsNEbXN92eSIQVoiFWlOvVo1ar3T7JS4ZhKJVxyKPRzc1xq1cVVZp8MQuIG+VQzPBi/wcVq7fPQyNuggAAAABJRU5ErkJggg=="));
        categories.add(new CategoryModel("","MATHEMATICS","data:image/png;base64,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"));
        categories.add(new CategoryModel("","MATHEMATICS",""));
        categories.add(new CategoryModel("","MATHEMATICS",""));
        categories.add(new CategoryModel("","MATHEMATICS",""));
        categories.add(new CategoryModel("","MATHEMATICS",""));
        CategoryAdapter adapter=new CategoryAdapter(this,categories);
        binding.categoryList.setLayoutManager(new GridLayoutManager(this,2));
        binding.categoryList.setAdapter(adapter);
    }
}